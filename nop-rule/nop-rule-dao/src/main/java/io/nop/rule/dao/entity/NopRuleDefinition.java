package io.nop.rule.dao.entity;

import io.nop.api.core.annotations.biz.BizObjName;
import io.nop.rule.dao.entity._gen._NopRuleDefinition;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static io.nop.rule.dao.NopRuleDaoConstants.BEFORE_EXECUTE_NAME;
import static io.nop.rule.dao.NopRuleDaoConstants.DECISION_MATRIX_NAME;
import static io.nop.rule.dao.NopRuleDaoConstants.INPUTS_NAME;
import static io.nop.rule.dao.NopRuleDaoConstants.OUTPUTS_NAME;
import static io.nop.rule.dao.NopRuleDaoConstants.RULE_TAG_NAME;
import static io.nop.rule.dao.NopRuleDaoConstants.XDEF_PATH_RULE;


@BizObjName("NopRuleDefinition")
public class NopRuleDefinition extends _NopRuleDefinition {
    public NopRuleDefinition() {
    }

    public Set<String> getRoleIds() {
        Set<String> roleIds = new HashSet<>();
        for (NopRuleRole ruleRole : getRuleRoles()) {
            roleIds.add(ruleRole.getRoleId());
        }
        return roleIds;
    }

    public List<Map<String, Object>> getRuleInputs() {
        return (List<Map<String, Object>>) getModelTextXmlComponent().getChildValue(XDEF_PATH_RULE, INPUTS_NAME);
    }

    public void setRuleInputs(List<Map<String, Object>> ruleInputs) {
        getModelTextXmlComponent().setChildValue(XDEF_PATH_RULE, INPUTS_NAME, ruleInputs);
    }

    public List<Map<String, Object>> getRuleOutputs() {
        return (List<Map<String, Object>>) getModelTextXmlComponent().getChildValue(XDEF_PATH_RULE, OUTPUTS_NAME);

    }

    public void setRuleOutputs(List<Map<String, Object>> ruleOutputs) {
        getModelTextXmlComponent().setChildValue(XDEF_PATH_RULE, OUTPUTS_NAME, ruleOutputs);
    }

    public String getBeforeExecute() {
        return getModelTextXmlComponent().getChildBodyXml(BEFORE_EXECUTE_NAME);
    }

    public void setBeforeExecute(String value) {
        getModelTextXmlComponent().setChildBodyXml(RULE_TAG_NAME, BEFORE_EXECUTE_NAME, value);
    }

    public String getDecisionMatrxi() {
        return getModelTextXmlComponent().getChildBodyXml(DECISION_MATRIX_NAME);
    }

    public void setDecisionMatrix(String value) {
        getModelTextXmlComponent().setChildBodyXml(RULE_TAG_NAME, DECISION_MATRIX_NAME, value);
    }
}