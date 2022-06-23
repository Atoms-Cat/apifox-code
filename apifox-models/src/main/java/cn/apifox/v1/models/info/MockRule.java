package cn.apifox.v1.models.info;

import java.util.List;

/**
 * @author th158
 */
public class MockRule {

    private List<String> rules;

    private Boolean enableSystemRule;

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public Boolean getEnableSystemRule() {
        return enableSystemRule;
    }

    public void setEnableSystemRule(Boolean enableSystemRule) {
        this.enableSystemRule = enableSystemRule;
    }
}
