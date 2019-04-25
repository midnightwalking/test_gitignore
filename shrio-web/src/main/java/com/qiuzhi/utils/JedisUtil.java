package com.qiuzhi.utils;

import com.qiuzhi.dao.mapper.ArticleMapper;
import com.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;
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

    @Autowired
    private ArticleMapper articleMapper;

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


    public void zSetArticles(List<Article> articles){
        Jedis jedis = getResource();
        try {
            for (Article article : articles) {
                String id = article.getId();
                String title = article.getTitle();
                jedis.zadd("hotArticles", 0, id + "@" + title);
                article.setIs_zset("1");
                articleMapper.updateByPrimaryKey(article);
            }
        }finally {
            jedis.close();
        }
    }

    /**
     * @Author qiuzhi
     * @Description 获取排行榜
     * @Date 18:05 2019/1/29
     * @Param []
     * @return java.util.Set<java.lang.String>
     **/

    public Set<String> getHotArticle(){
        Jedis jedis = getResource();
        try {
            Set<String> hotArticles = jedis.zrevrange("hotArticles", 0, -1);
            return hotArticles;
        }finally {
            jedis.close();
        }
    }

    /**
     * @Author qiuzhi
     * @Description 更新分数
     * @Date 18:05 2019/1/29
     * @Param [key]
     * @return void
     **/

    public void addScoreByKey(String key){
        Jedis jedis = getResource();
        try {
           double addResult = jedis.zincrby("hotArticles",1,key);
           System.out.println("更新结果：" + addResult);
        }finally {
            jedis.close();
        }
    }
}
