/**
 * Copyright (c) 2017-2023 Nop Platform. All rights reserved.
 * Author: canonical_entropy@163.com
 * Blog:   https://www.zhihu.com/people/canonical-entropy
 * Gitee:  https://gitee.com/canonical-entropy/nop-chaos
 * Github: https://github.com/entropy-cloud/nop-chaos
 */
package io.nop.xlang.expr;

import io.nop.api.core.ApiConfigs;
import io.nop.api.core.beans.query.OrderFieldBean;
import io.nop.api.core.config.AppConfig;
import io.nop.commons.util.CollectionHelper;
import io.nop.commons.util.objects.Pair;
import io.nop.core.lang.eval.IEvalAction;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.lang.json.JsonTool;
import io.nop.core.unittest.BaseTestCase;
import io.nop.xlang.api.ExprEvalAction;
import io.nop.xlang.api.XLang;
import io.nop.xlang.ast.BinaryExpression;
import io.nop.xlang.expr.simple.SimpleExprParser;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestSimpleExprParser {
    @Test
    public void testTemplateExpr() {
        String expr = "${tablePackages[entity.id]}.${entity.defKey.$camelCase(true)}";
        XLang.newCompileTool().allowUnregisteredScopeVar(true).compileTemplateExpr(null, expr, false, ExprPhase.eval);
    }

    @Test
    public void testSpread() {
        assertEquals("{\n" + "  \"desc\": false,\n" + "  \"name\": \"a\",\n" + "  \"nullsFirst\": null,\n"
                + "  \"owner\": null\n" + "}", JsonTool.serialize(eval("{...bean, ...NULL}"), true));
    }

    @Test
    public void testCpExpr() {
        String expr = "#{3}";
        assertEquals(3, XLang.newCompileTool().getStaticValue(null, expr));
    }

    @Test
    public void testNot() {
        assertEquals(false, eval("!x"));
    }

    @Test
    public void testNotEq() {
        assertEquals(true, eval("3 != 2"));
    }

    @Test
    public void testExtensionMethod() {
        assertEquals("myTest", eval("'my_test'.$camelCase(false)"));
    }

    @Test
    public void testArithmetic() {
        assertEquals(2, eval("x+1"));
        assertEquals(0, eval("x-1"));
        assertEquals(2, eval("x*2"));
        assertEquals(0.5, eval("x/2"));
        assertEquals(1, eval("x||2"));
    }

    @Test
    public void testIndexOf() {
        assertEquals(2, eval("'abc'.indexOf('c')"));
    }

    @Test
    public void testInstanceOf() {
        assertEquals(true, eval("'s' instanceof String"));
    }

    @Test
    public void testTernaryExpr() {
        BaseTestCase.forceStackTrace();
        String expr = "listGrid.rowDeleteIcon ?? (listGrid.rowDeleteLabel ? null : 'text-danger')";
        SimpleExprParser.newDefault().parseExpr(null, expr);
    }

    @Test
    public void testBinaryCompare() {
        String text = "pageModel.table.pager != 'none'";
        BinaryExpression expr = (BinaryExpression) SimpleExprParser.newDefault().parseExpr(null, text);
        assertNotNull(expr.getLeft());
    }

    @Test
    public void testOptionalMember() {
        AppConfig.getConfigProvider().updateConfigValue(ApiConfigs.CFG_EXCEPTION_FILL_STACKTRACE, true);
        String text = "a ?. b  ?.  [3] ?. \n(3)";
        SimpleExprParser.newDefault().parseExpr(null, text);
    }

    @Test
    public void testFunctionCall() {
        BaseTestCase.forceStackTrace();
        Function<Integer, String> test = this::test;
        IEvalScope scope = XLang.newEvalScope();
        scope.setLocalValue("test", test);

        String expr = "test(3)";
        IEvalAction action = XLang.newCompileTool().allowUnregisteredScopeVar(true).compileSimpleExpr(null, expr);
        assertEquals("4", action.invoke(scope));
    }

    String test(int value) {
        return String.valueOf(value + 1);
    }

    Object eval(String expr) {
        Map<String, Object> vars = new HashMap<>();
        vars.put("x", 1);
        vars.put("m", CollectionHelper.buildImmutableMap(Pair.of("a", 1), Pair.of("b", "3")));
        vars.put("L", Arrays.asList(1, 2, 3));
        vars.put("NULL", null);

        OrderFieldBean bean = new OrderFieldBean();
        bean.setName("a");
        bean.setDesc(false);
        vars.put("bean", bean);

        ExprEvalAction action = XLang.newCompileTool().allowUnregisteredScopeVar(true).compileSimpleExpr(null, expr);
        return action.invoke(XLang.newEvalScope(vars));
    }
}
