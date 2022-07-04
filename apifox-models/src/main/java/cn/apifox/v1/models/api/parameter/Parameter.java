package cn.apifox.v1.models.api.parameter;

import java.util.List;

public class Parameter {

    private List<String> path;

    private List<Query> query;

    private List<String> cookie;

    private List<String> header;

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public List<Query> getQuery() {
        return query;
    }

    public void setQuery(List<Query> query) {
        this.query = query;
    }

    public List<String> getCookie() {
        return cookie;
    }

    public void setCookie(List<String> cookie) {
        this.cookie = cookie;
    }

    public List<String> getHeader() {
        return header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }
}
