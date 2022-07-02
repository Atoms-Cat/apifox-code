package cn.apifox.redis.v1;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisClientConfig;
import redis.clients.jedis.Protocol;
import redis.clients.jedis.util.SafeEncoder;

import java.util.ArrayList;
import java.util.List;


/**
 * @author th158
 */
public class RedisClientApp {


    public static void main(String[] args) {
        // 连接 redis 配置
        String redisConfig = args[0];
        RedisConfigParam param = JSONObject.parseObject(redisConfig, RedisConfigParam.class);
        // 操作 redis 命令
        String redisCmd = args[1];
        Protocol.Command command = Protocol.Command.valueOf(redisCmd);
        // 操作 redis 命令的参数
        SendCommandParam sendCommandParam = new SendCommandParam();
        sendCommandParam.setCmd(command);
        List<String> argList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (i != 0 && i != 1) {
                argList.add(args[i]);
            }
        }
        sendCommandParam.setArgs(SafeEncoder.encodeMany(argList.toArray(new String[0])));
        Object obj = sendCommand(param, sendCommandParam);
        if (obj != null && obj instanceof byte[]) {
            System.out.println(JSONObject.toJSONString(SafeEncoder.encodeObject(obj)));
        }
    }

    private static Object sendCommand(RedisConfigParam param, SendCommandParam sendCommandParam) {
        JedisClientConfig config = DefaultJedisClientConfig.builder()
                .database(param.getDatabase())
                .ssl(param.getSsl())
                .password(param.getPassword())
                .blockingSocketTimeoutMillis(param.getBlockingSocketTimeoutMillis())
                .connectionTimeoutMillis(param.getConnectionTimeoutMillis())
                .socketTimeoutMillis(param.getSocketTimeoutMillis())
                .user(param.getUser())
                .clientName(param.getClientName())
                .build();
        Jedis jedis = new Jedis(param.getHost(), param.getPort(), config);
        if (jedis.isConnected()) {
            return jedis.sendCommand(sendCommandParam.getCmd(), sendCommandParam.getArgs());
        }
        return null;
    }

}
