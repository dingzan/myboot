package com.dingzan.system.conf;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dingzan.service.RedisService;

import java.io.*;


@Component
public class RedisShiroSessionDAO extends EnterpriseCacheSessionDAO {
    
	@Autowired
    private RedisService redisService;

    //创建session
    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = super.doCreate(session);
        String key = this.getShiroSessionKey(sessionId.toString());
        redisService.set(key, session);
        return sessionId;
    }

    //获取session
    @Override
    protected Session doReadSession(Serializable sessionId) {
        Session session = super.doReadSession(sessionId);
        if(session == null){
            String key = this.getShiroSessionKey(sessionId.toString());
            session = (Session) redisService.get(key);
        }
        return session;
    }

    //更新session
    @Override
    protected void doUpdate(Session session) {
        super.doUpdate(session);
        String key = this.getShiroSessionKey(session.getId().toString());
        redisService.set(key, session);
    }

    //删除session
    @Override
    protected void doDelete(Session session) {
        super.doDelete(session);
        String key = this.getShiroSessionKey(session.getId().toString());
        redisService.remove(key);
    }

    //生成session key 
    public  String getShiroSessionKey(String key){
        return "sessionid:" + key;
    }
    
    // 把session对象转化为byte保存到redis中
    public byte[] sessionToByte(Session session){
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        byte[] bytes = null;
        try {
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(session);
            bytes = bo.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
    
    // 把byte还原为session
    public Session byteToSession(byte[] bytes){
        ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
        ObjectInputStream in;
        SimpleSession session = null;
        try {
            in = new ObjectInputStream(bi);
            session = (SimpleSession) in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return session;
    }
}
