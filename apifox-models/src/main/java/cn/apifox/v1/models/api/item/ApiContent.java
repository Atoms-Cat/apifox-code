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

}
