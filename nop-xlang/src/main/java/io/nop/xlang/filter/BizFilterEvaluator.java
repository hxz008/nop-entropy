/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.filter;

import io.nop.api.core.beans.ITreeBean;
import io.nop.api.core.convert.ConvertHelper;
import io.nop.api.core.util.IVariableScope;
import io.nop.commons.util.StringHelper;
import io.nop.core.context.IServiceContext;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.model.query.BeanVariableScope;
import io.nop.core.model.query.FilterBeanEvaluator;
import io.nop.xlang.api.XLang;
import io.nop.xlang.xpl.IXplTag;

import java.util.HashMap;
import java.util.Map;

public class BizFilterEvaluator extends FilterBeanEvaluator {
    private final String libPath;
    private final IServiceContext context;

    public BizFilterEvaluator(String libPath, IServiceContext context) {
        this.libPath = libPath;
        this.context = context;
    }

    public BizFilterEvaluator(IServiceContext context) {
        this(BizFilterConstants.XLIB_BIZ_CHECK_PATH, context);
    }

    public boolean testForEntity(ITreeBean filter, Object entity) {
        BizExprHelper.resolveBizExpr(filter, context);
        IVariableScope scope;
        if (entity instanceof IVariableScope) {
            scope = (IVariableScope) entity;
        } else {
            scope = new BeanVariableScope(entity);
        }
        return Boolean.TRUE.equals(visitRoot(filter, scope));
    }

    @Override
    public Boolean visitUnknown(String op, ITreeBean filter, IVariableScope scope) {
        String tagName = filter.getTagName();
        if (!StringHelper.startsWithNamespace(tagName, BizFilterConstants.XLIB_NS_BIZ))
            return super.visitUnknown(op, filter, scope);

        String libTag = tagName.substring(BizFilterConstants.XLIB_NS_BIZ.length() + 1);
        // prepareArgs的过程中可能会修改attrs集合，所以需要复制一份
        Map<String, Object> args = filter.getAttrs() == null ? new HashMap<>() : new HashMap<>(filter.getAttrs());
        // biz标签库中的标签
        IEvalScope evalScope = context.getEvalScope();
        IXplTag tag = XLang.getTag(libPath, libTag);
        args = tag.prepareArgs(evalScope, args);
        Object ret = tag.invokeWithNamedArgs(evalScope, args);
        return ConvertHelper.toTruthy(ret);
    }
}
