package cn.apifox.v1.models;

import cn.apifox.v1.models.api.ApiCollection;
import cn.apifox.v1.models.doc.DocCollection;
import cn.apifox.v1.models.info.Info;
import cn.apifox.v1.models.response.ResponseCollection;
import cn.apifox.v1.models.schema.SchemaCollection;
import cn.apifox.v1.models.socket.SocketCollection;

import java.util.List;

/**
 * root model
 */
public class ApifoxProject {
    /**
     * apifox version
     */
    private String apifoxProject;

    /**
     * info
     */
    private Info info;

    /**
     * todo
     */
    private List<ResponseCollection> responseCollection;

    /**
     * api info
     */
    private List<ApiCollection> apiCollection;

    /**
     * todo
     */
    private List<SocketCollection> socketCollection;

    /**
     * doc
     */
    private List<DocCollection> docCollection;

    /**
     * Schema
     */
    private List<SchemaCollection> schemaCollection;

    /**
     * todo
     */
    private List<Object> apiTestCaseCollection;

    /**
     * todo
     */
    private List<Object> apiTestSuiteCollection;

    /**
     * todo
     */
    private List<Object> environments;

    /**
     * todo
     */
    private List<Object> commonScripts;

    /**
     * todo
     */
    private List<Object> databaseConnections;

    /**
     * todo
     */
    private List<Object> globalVariables;

    /**
     * todo
     */
    private List<Object> commonParameters;

    /**
     * todo
     */
    private List<Object> projectSetting;

    public String getApifoxProject() {
        return apifoxProject;
    }

    public void setApifoxProject(String apifoxProject) {
        this.apifoxProject = apifoxProject;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<ResponseCollection> getResponseCollection() {
        return responseCollection;
    }

    public void setResponseCollection(List<ResponseCollection> responseCollection) {
        this.responseCollection = responseCollection;
    }

    public List<ApiCollection> getApiCollection() {
        return apiCollection;
    }

    public void setApiCollection(List<ApiCollection> apiCollection) {
        this.apiCollection = apiCollection;
    }

    public List<SocketCollection> getSocketCollection() {
        return socketCollection;
    }

    public void setSocketCollection(List<SocketCollection> socketCollection) {
        this.socketCollection = socketCollection;
    }

    public List<DocCollection> getDocCollection() {
        return docCollection;
    }

    public void setDocCollection(List<DocCollection> docCollection) {
        this.docCollection = docCollection;
    }

    public List<SchemaCollection> getSchemaCollection() {
        return schemaCollection;
    }

    public void setSchemaCollection(List<SchemaCollection> schemaCollection) {
        this.schemaCollection = schemaCollection;
    }

    public List<Object> getApiTestCaseCollection() {
        return apiTestCaseCollection;
    }

    public void setApiTestCaseCollection(List<Object> apiTestCaseCollection) {
        this.apiTestCaseCollection = apiTestCaseCollection;
    }

    public List<Object> getApiTestSuiteCollection() {
        return apiTestSuiteCollection;
    }

    public void setApiTestSuiteCollection(List<Object> apiTestSuiteCollection) {
        this.apiTestSuiteCollection = apiTestSuiteCollection;
    }

    public List<Object> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Object> environments) {
        this.environments = environments;
    }

    public List<Object> getCommonScripts() {
        return commonScripts;
    }

    public void setCommonScripts(List<Object> commonScripts) {
        this.commonScripts = commonScripts;
    }

    public List<Object> getDatabaseConnections() {
        return databaseConnections;
    }

    public void setDatabaseConnections(List<Object> databaseConnections) {
        this.databaseConnections = databaseConnections;
    }

    public List<Object> getGlobalVariables() {
        return globalVariables;
    }

    public void setGlobalVariables(List<Object> globalVariables) {
        this.globalVariables = globalVariables;
    }

    public List<Object> getCommonParameters() {
        return commonParameters;
    }

    public void setCommonParameters(List<Object> commonParameters) {
        this.commonParameters = commonParameters;
    }

    public List<Object> getProjectSetting() {
        return projectSetting;
    }

    public void setProjectSetting(List<Object> projectSetting) {
        this.projectSetting = projectSetting;
    }
}
