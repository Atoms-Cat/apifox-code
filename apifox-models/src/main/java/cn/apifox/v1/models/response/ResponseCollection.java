package cn.apifox.v1.models.response;

import cn.apifox.v1.models.schema.JsonSchema;

/**
 * TODO
 *
 * @author th158
 */
public class ResponseCollection {

    private JsonSchema jsonSchema;

    private Boolean defaultEnable;

    private String name;

    private Integer code;

    private String contentType;

    private String id;

    public JsonSchema getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(JsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public Boolean getDefaultEnable() {
        return defaultEnable;
    }

    public void setDefaultEnable(Boolean defaultEnable) {
        this.defaultEnable = defaultEnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
