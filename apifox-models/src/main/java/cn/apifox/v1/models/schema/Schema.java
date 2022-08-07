package cn.apifox.v1.models.schema;

import cn.apifox.v1.models.mock.Mock;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Schema {
    private String type;

    private String title;

    private String description;

    private String format;

    @JsonProperty(value = "$ref", required = true)
    private String ref;

    private String example;

    private SchemaXml xml;

    private List<String> required;

    @JsonProperty(value = "x-apifox-orders", required = true)
    private List<String> xApifoxOrders;

    private Map<String, Schema> properties;

    @JsonProperty(value = "enum", required = true)
    private List<String> enumList;

    private List<Schema> oneOf;

    private List<Schema> anyOf;

    private List<Schema> allOf;

    private Mock mock;

    private JsonSchema jsonSchema;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public SchemaXml getXml() {
        return xml;
    }

    public void setXml(SchemaXml xml) {
        this.xml = xml;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public List<String> getxApifoxOrders() {
        return xApifoxOrders;
    }

    public void setxApifoxOrders(List<String> xApifoxOrders) {
        this.xApifoxOrders = xApifoxOrders;
    }

    public Map<String, Schema> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Schema> properties) {
        this.properties = properties;
    }

    public List<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(List<String> enumList) {
        this.enumList = enumList;
    }

    public List<Schema> getOneOf() {
        return oneOf;
    }

    public void setOneOf(List<Schema> oneOf) {
        this.oneOf = oneOf;
    }

    public List<Schema> getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(List<Schema> anyOf) {
        this.anyOf = anyOf;
    }

    public List<Schema> getAllOf() {
        return allOf;
    }

    public void setAllOf(List<Schema> allOf) {
        this.allOf = allOf;
    }

    public JsonSchema getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(JsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public JsonSchema getItems() {
        return items;
    }

    public void setItems(JsonSchema items) {
        this.items = items;
    }
}
