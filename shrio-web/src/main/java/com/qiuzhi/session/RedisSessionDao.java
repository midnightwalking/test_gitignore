package com.qiuzhi.session;

import com.qiuzhi.utils.JedisUtil;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.springframework.util.SerializationUtils;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qiuzhi
 * @date 2018/11/2
 * @description
 */
public class RedisSessionDao extends AbstractSessionDAO {

    @Resource
    private JedisUtil jedisUtil;

    private final String SHIRO_SESSION_PREFIX = "qiuzhi-session";

    private byte[] getKey(String key){
        return (SHIRO_SESSION_PREFIX + key).getBytes();
    }

    private void savaSession(Session session){
        if(session != null && session.getId() != null){
            byte[] key =  getKey(session.getId().toString());
            byte[] value = SerializationUtils.serialize(session);
            jedisUtil.set(key,value);
            jedisUtil.expire(key,600);
        }
    }

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        savaSession(session);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        if(sessionId == null){
            return null;
        }
        byte[] key = getKey(sessionId.toString());
        byte[] value = jedisUtil.get(key);
        return (Session) SerializationUtils.deserialize(value);
    }

    @Override
    public void update(Session session) throws UnknownSessionException {
        savaSession(session);
    }

    @Override
    public void delete(Session session) {
        if(session != null && session.getId() != null) {
            byte[] key = getKey(session.getId().toString());
            jedisUtil.del(key);
        }
    }

    @Override
    public Collection<Session> getActiveSessions() {
        // 先根据前缀获取所有的key byte[]
        Set<byte[]> activeSessions = jedisUtil.getkeys(SHIRO_SESSION_PREFIX);
        Set<Session> sessions = new HashSet<>();
        if(activeSessions == null){
            return sessions;
        }
        for(byte[] bytes : activeSessions){
            Session session = (Session) SerializationUtils.deserialize(jedisUtil.get(bytes));
            sessions.add(session);
        }

        return sessions;
    }
}
