package cn.apifox.v1.models;

import cn.apifox.v1.models.api.ApiCollection;
import cn.apifox.v1.models.info.Info;
import cn.apifox.v1.models.response.ResponseCollection;

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
