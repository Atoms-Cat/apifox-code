package cn.apifox.v1.models.api.item;

import cn.apifox.v1.models.api.CustomApiField;
import cn.apifox.v1.models.api.parameter.*;
import cn.apifox.v1.models.api.setting.AdvancedSetting;
import cn.apifox.v1.models.mock.ApiMock;

import java.util.List;

public class ApiContent {
    private String id;

    private String method;

    private String path;

    private Parameter parameters;

    private CommonParameter commonParameters;

    private List<Response> responses;

    /**
     * todo
     */
    private List<Object> responseExamples;

    private RequestBody requestBody;

    private String description;

    private List<String> tags;

    private String status;

    private String serverId;

    private String operationId;

    private String sourceUrl;

    private Integer ordering;

    /**
     * todo
     */
    private List<Case> cases;

    private List<ApiMock> mocks;

    private CustomApiField customApiFields;

    private AdvancedSetting advancedSettings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }

    public CommonParameter getCommonParameters() {
        return commonParameters;
    }

    public void setCommonParameters(CommonParameter commonParameters) {
        this.commonParameters = commonParameters;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public List<Object> getResponseExamples() {
        return responseExamples;
    }

    public void setResponseExamples(List<Object> responseExamples) {
        this.responseExamples = responseExamples;
    }

    public RequestBody getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public List<ApiMock> getMocks() {
        return mocks;
    }

    public void setMocks(List<ApiMock> mocks) {
        this.mocks = mocks;
    }

    public CustomApiField getCustomApiFields() {
        return customApiFields;
    }

    public void setCustomApiFields(CustomApiField customApiFields) {
        this.customApiFields = customApiFields;
    }

    public AdvancedSetting getAdvancedSettings() {
        return advancedSettings;
    }

    public void setAdvancedSettings(AdvancedSetting advancedSettings) {
        this.advancedSettings = advancedSettings;
    }
}
