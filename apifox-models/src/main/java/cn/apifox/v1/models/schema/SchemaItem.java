package cn.apifox.v1.models.schema;

import java.util.List;

public class SchemaItem {

    private String name;

    private String id;

    private String description;

    private Schema schema;

    private List<SchemaItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public List<SchemaItem> getItems() {
        return items;
    }

    public void setItems(List<SchemaItem> items) {
        this.items = items;
    }
}
