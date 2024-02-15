/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.spring.web.filter;

import io.nop.api.core.ioc.BeanContainer;
import io.nop.api.core.util.FutureHelper;
import io.nop.api.core.util.OrderedComparator;
import io.nop.http.api.server.HttpServerHelper;
import io.nop.http.api.server.IHttpServerContext;
import io.nop.http.api.server.IHttpServerFilter;
import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@ConditionalOnProperty(name = "nop.web.http-server-filter.enabled", havingValue = "true", matchIfMissing = true)
public class SpringHttpServerFilterConfiguration {
    private List<IHttpServerFilter> filters;

    @Value("${nop.spring.http-server-filter.sys-order:0}")
    int sysFilterOrder;

    @Value("${nop.spring.http-server-filter.app-order:1000}")
    int appFilterOrder;

    public synchronized List<IHttpServerFilter> getFilters(boolean sys) {
        if (filters == null) {
            filters = new ArrayList<>(
                    BeanContainer.instance().getBeansOfType(IHttpServerFilter.class).values());
            Collections.sort(filters, OrderedComparator.instance());
        }
        return filters.stream().filter(filter -> {
            boolean high = filter.order() < IHttpServerFilter.NORMAL_PRIORITY;
            return sys == high;
        }).collect(Collectors.toList());
    }

    @Bean
    public FilterRegistrationBean<Filter> registerSysFilter() {
        return createFilter(true, sysFilterOrder);
    }

    @Bean
    public FilterRegistrationBean<Filter> registerAppFilter() {
        return createFilter(false, appFilterOrder);
    }

    FilterRegistrationBean<Filter> createFilter(boolean sys, int filterOrder) {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(((request, response, chain) -> {
            List<IHttpServerFilter> serverFilters = getFilters(sys);

            if (serverFilters.isEmpty()) {
                chain.doFilter(request, response);
            } else {
                IHttpServerContext ctx = new ServletHttpServerContext((HttpServletRequest) request,
                        (HttpServletResponse) response);
                HttpServerHelper.runWithFilters(serverFilters, ctx, () -> {
                    return FutureHelper.futureCall(() -> {
                        chain.doFilter(request, response);
                        return null;
                    });
                });
            }
        }));

        // 设置优先级为正常，系统可以在前面增加过滤器？
        bean.setOrder(filterOrder);
        bean.setEnabled(true);
        bean.addUrlPatterns("/*");
        return bean;
    }
}