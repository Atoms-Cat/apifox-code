package cn.apifox.v1.models.info;

/**
 * @author th158
 */
public class Info {

    private String name;

    private String description;

    private MockRule mockRule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MockRule getMockRule() {
        return mockRule;
    }

    public void setMockRule(MockRule mockRule) {
        this.mockRule = mockRule;
    }
}
