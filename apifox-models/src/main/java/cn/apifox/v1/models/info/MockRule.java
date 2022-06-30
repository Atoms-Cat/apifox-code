package cn.apifox.v1.models.info;

import java.util.List;

/**
 * @author th158
 */
public class MockRule {

    private List<Rule> rules;

    private Boolean enableSystemRule;

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public Boolean getEnableSystemRule() {
        return enableSystemRule;
    }

    public void setEnableSystemRule(Boolean enableSystemRule) {
        this.enableSystemRule = enableSystemRule;
    }
}
