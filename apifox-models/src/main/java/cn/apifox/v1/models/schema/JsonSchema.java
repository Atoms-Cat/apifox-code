package cn.apifox.v1.models.schema;


import cn.apifox.v1.models.schema.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class JsonSchema {

    private String type;

    private Map<String, Schema> properties;

    private List<String> required;

    private String description;

    @JsonProperty(value = "x-apifox-orders", required = true)
    private List<String> xApifoxOrders;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Schema> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Schema> properties) {
        this.properties = properties;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getxApifoxOrders() {
        return xApifoxOrders;
    }

    public void setxApifoxOrders(List<String> xApifoxOrders) {
        this.xApifoxOrders = xApifoxOrders;
    }
}
