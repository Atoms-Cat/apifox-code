package cn.apifox.v1.models.api;

import cn.apifox.v1.models.api.item.ApiItem;
import cn.apifox.v1.models.api.processors.PostProcessor;
import cn.apifox.v1.models.api.processors.PreProcessor;

import java.util.List;

public class ApiCollection {
    private String name;

    private Integer parentId;

    private String serverId;

    private String description;

    private List<PreProcessor> preProcessors;

    private List<PostProcessor> postProcessors;

    private Auth auth;

    private List<ApiItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
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

    public List<PreProcessor> getPreProcessors() {
        return preProcessors;
    }

    public void setPreProcessors(List<PreProcessor> preProcessors) {
        this.preProcessors = preProcessors;
    }

    public List<PostProcessor> getPostProcessors() {
        return postProcessors;
    }

    public void setPostProcessors(List<PostProcessor> postProcessors) {
        this.postProcessors = postProcessors;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public List<ApiItem> getItems() {
        return items;
    }

    public void setItems(List<ApiItem> items) {
        this.items = items;
    }
}
