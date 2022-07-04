package cn.apifox.v1.models.api.parameter;

import cn.apifox.v1.models.api.Auth;
import cn.apifox.v1.models.api.processors.PostProcessor;
import cn.apifox.v1.models.api.processors.PreProcessor;
import cn.apifox.v1.models.api.setting.AdvancedSetting;

import java.util.List;

public class Case {
    private Long id;

    private String name;

    private Long responseId;

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
}
