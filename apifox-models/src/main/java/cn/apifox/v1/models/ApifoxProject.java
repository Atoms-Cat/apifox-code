package cn.apifox.v1.models;

import cn.apifox.v1.models.info.Info;

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
