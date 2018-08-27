package com.jz.quoteoperation.common.util;

import com.jz.quoteoperation.common.constant.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service(value = "jedisClient")
public class JedisClientUtil {
    @Autowired
    private JedisPool jedisPool;

    //获取key的value值
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String str = "";
        try {
            str = jedis.get(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String str = "";
        try {
            str = jedis.set(key, value);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /**
     * 设置指定生命周期的缓存对象
     * @param key
     * @param seconds 生命周期 秒
     * @param value
     * @return
     */
    public String setex(String key, int seconds, String value) {
        Jedis jedis = jedisPool.getResource();
        String str = "";
        try {
            str = jedis.setex(key, seconds, value);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    //判断key是否存在
    public boolean existKey(String key) {
        boolean result = false;
        Jedis jedis = jedisPool.getResource();
        try {
            result = jedis.exists(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    //清除缓存
    public void clearCache(){
        Jedis jedis = jedisPool.getResource();
        try{
            jedis.del(CommonConstants.DICT_CACHE);
            jedis.del(CommonConstants.USER_CACHE);
        }finally{
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
