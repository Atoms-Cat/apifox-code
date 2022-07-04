package cn.apifox.v1.models.api.processors;

public class PostProcessor {

    private String type;

    private ProcessorData data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProcessorData getData() {
        return data;
    }

    public void setData(ProcessorData data) {
        this.data = data;
    }
}
