package cn.apifox.v1.models.api;

public class Api {
    private String name;

    private ApiContent api;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiContent getApi() {
        return api;
    }

    public void setApi(ApiContent api) {
        this.api = api;
    }
}
