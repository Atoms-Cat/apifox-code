package cn.apifox.redis.v1;


import lombok.Data;

/**
 *
 * @author th158
 */
@Data
public class RedisConfigParam {
    private String host = "localhost";
    private Integer port = 6379;
    private Integer connectionTimeoutMillis = 60000;
    private Integer socketTimeoutMillis = 60000;
    private Integer blockingSocketTimeoutMillis = 60000;
    private String user;
    private String password;
    private Integer database = 0;
    private String clientName;
    private Boolean ssl = false;
}
