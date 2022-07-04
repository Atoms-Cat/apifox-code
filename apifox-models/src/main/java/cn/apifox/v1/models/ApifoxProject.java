package cn.apifox.v1.models;

import cn.apifox.v1.models.api.ApiCollection;
import cn.apifox.v1.models.info.Info;
import cn.apifox.v1.models.response.ResponseCollection;
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

    private List<ApiCollection> apiCollection;

    private List<SocketCollection> socketCollection;

    /**
     * todo
     */
    private List<Object> docCollection;

    /**
     * todo
     */
    private List<Object> schemaCollection;

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
}
