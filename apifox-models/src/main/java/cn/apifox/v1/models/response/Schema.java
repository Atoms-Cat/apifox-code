package cn.apifox.v1.models.response;

public class Schema {
    private String type;

    private String title;

    private Mock mock;

    /**
     * "type": "array"
     */
    private JsonSchema items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Mock getMock() {
        return mock;
    }

    public void setMock(Mock mock) {
        this.mock = mock;
    }
}
