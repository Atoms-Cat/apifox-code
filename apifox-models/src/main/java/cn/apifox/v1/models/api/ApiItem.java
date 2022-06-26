package cn.apifox.v1.models.api;

import java.util.List;

public class ApiItem {
    private String name;

    private Long parentId;

    private String serverId;

    private String description;

    private List<Object> preProcessors;

    private List<Object> postProcessors;

    private Auth auth;

    private List<Api> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getPreProcessors() {
        return preProcessors;
    }

    public void setPreProcessors(List<Object> preProcessors) {
        this.preProcessors = preProcessors;
    }

    public List<Object> getPostProcessors() {
        return postProcessors;
    }

    public void setPostProcessors(List<Object> postProcessors) {
        this.postProcessors = postProcessors;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public List<Api> getItems() {
        return items;
    }

    public void setItems(List<Api> items) {
        this.items = items;
    }
}
