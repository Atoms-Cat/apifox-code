package cn.apifox.v1.models.schema;

import java.util.List;

public class SchemaCollection {

    private String name;

    private List<SchemaItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SchemaItem> getItems() {
        return items;
    }

    public void setItems(List<SchemaItem> items) {
        this.items = items;
    }
}
