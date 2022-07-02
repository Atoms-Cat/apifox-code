package cn.apifox.redis.v1;

import lombok.Data;
import redis.clients.jedis.Protocol;


/**
 * @author th158
 */
@Data
public class SendCommandParam {

    Protocol.Command cmd;

    byte[][] args;

}
