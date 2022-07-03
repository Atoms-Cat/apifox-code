package cn.apifox.v1.models.api.parameter;

import java.util.List;

public class RequestBody {

    private System type;

    private List<RequestParameter> parameters;

    public System getType() {
        return type;
    }

    public void setType(System type) {
        this.type = type;
    }

    public List<RequestParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<RequestParameter> parameters) {
        this.parameters = parameters;
    }
}
