package com.qiuzhi.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author qiuzhi
 * @date 2018/11/2
 * @description
 */

@Component
public class JedisUtil {

    @Resource(name = "jedisPool")
    private JedisPool jedisPool;

    private Jedis getResource(){
        return jedisPool.getResource();
    }

    public byte[] set(byte[] key, byte[] value){
        Jedis jedis = getResource();
        try{
            jedis.set(key,value);
            return value;
        }finally {
            jedis.close();
        }
    }

    public void expire(byte[] key, int i) {
        Jedis jedis = getResource();
        try{
            jedis.expire(key,i);
        }finally {
            jedis.close();
        }
    }

    public byte[] get(byte[] key) {
        Jedis jedis = getResource();
        try{
           return jedis.get(key);
        }finally {
            jedis.close();
        }
    }

    public void del(byte[] key) {
        Jedis jedis = getResource();
        try{
            jedis.del(key);
        }finally {
            jedis.close();
        }
    }

    public Set<byte[]> getkeys(String prefix) {
        Jedis jedis = getResource();
        try{
            return jedis.keys((prefix + "*").getBytes());
        }finally {
            jedis.close();
        }
    }
}
