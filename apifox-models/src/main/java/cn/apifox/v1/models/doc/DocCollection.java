package cn.apifox.v1.models.doc;

import java.util.List;

public class DocCollection {

    private String name;

    private List<DocCollection> children;

    private List<DocItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DocCollection> getChildren() {
        return children;
    }

    public void setChildren(List<DocCollection> children) {
        this.children = children;
    }

    public List<DocItem> getItems() {
        return items;
    }

    public void setItems(List<DocItem> items) {
        this.items = items;
    }
}
