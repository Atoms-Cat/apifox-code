package cn.apifox.v1.models.info;

import java.util.List;

public class Rule {

    private List<String> type;

    private String matchType;

    private String matchDetail;

    private Boolean matchCase;

    private String mock;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchDetail() {
        return matchDetail;
    }

    public void setMatchDetail(String matchDetail) {
        this.matchDetail = matchDetail;
    }

    public Boolean getMatchCase() {
        return matchCase;
    }

    public void setMatchCase(Boolean matchCase) {
        this.matchCase = matchCase;
    }

    public String getMock() {
        return mock;
    }

    public void setMock(String mock) {
        this.mock = mock;
    }
}
