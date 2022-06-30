package cn.apifox.v1.models.api.item;

import cn.apifox.v1.models.api.parameter.CommonParameter;
import cn.apifox.v1.models.api.parameter.Parameter;
import cn.apifox.v1.models.api.parameter.Response;

import java.util.List;

public class ApiContent {
    private String id;

    private String method;

    private String path;

    private Parameter parameters;

    private CommonParameter commonParameters;

    private List<Response> responses;


}
