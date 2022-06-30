package cn.apifox.v1.models.api.parameter;

import cn.apifox.v1.models.api.parameter.commonParameter.BodyItem;
import cn.apifox.v1.models.api.parameter.commonParameter.CookieItem;
import cn.apifox.v1.models.api.parameter.commonParameter.HeaderItem;
import cn.apifox.v1.models.api.parameter.commonParameter.QueryItem;

import java.util.List;

public class CommonParameter {
    private List<QueryItem> query;

    private List<BodyItem> body;

    private List<CookieItem> cookie;

    private List<HeaderItem> header;

    public List<QueryItem> getQuery() {
        return query;
    }

    public void setQuery(List<QueryItem> query) {
        this.query = query;
    }

    public List<BodyItem> getBody() {
        return body;
    }

    public void setBody(List<BodyItem> body) {
        this.body = body;
    }

    public List<CookieItem> getCookie() {
        return cookie;
    }

    public void setCookie(List<CookieItem> cookie) {
        this.cookie = cookie;
    }

    public List<HeaderItem> getHeader() {
        return header;
    }

    public void setHeader(List<HeaderItem> header) {
        this.header = header;
    }
}
