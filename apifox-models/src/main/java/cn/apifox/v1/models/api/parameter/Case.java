package cn.apifox.v1.models.api.parameter;

import cn.apifox.v1.models.api.Auth;
import cn.apifox.v1.models.api.processors.PostProcessor;
import cn.apifox.v1.models.api.processors.PreProcessor;
import cn.apifox.v1.models.api.setting.AdvancedSetting;

import java.util.List;

public class Case {
    private Integer id;

    private String name;

    private Integer responseId;

    private Parameter parameters;

    private Parameter commonParameters;

    private List<RequestBody> requestBody;

    /**
     * todo
     */
    private List<PreProcessor> preProcessors;

    private List<PostProcessor> postProcessors;

    private Auth auth;

    private AdvancedSetting advancedSettings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }

    public Parameter getCommonParameters() {
        return commonParameters;
    }

    public void setCommonParameters(Parameter commonParameters) {
        this.commonParameters = commonParameters;
    }

    public List<RequestBody> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(List<RequestBody> requestBody) {
        this.requestBody = requestBody;
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

    public AdvancedSetting getAdvancedSettings() {
        return advancedSettings;
    }

    public void setAdvancedSettings(AdvancedSetting advancedSettings) {
        this.advancedSettings = advancedSettings;
    }
}
