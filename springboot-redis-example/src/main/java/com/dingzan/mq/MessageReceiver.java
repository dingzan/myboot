package com.dingzan.mq;

import org.springframework.stereotype.Component;

/**
 * redis 消息处理器
 */
@Component
public class MessageReceiver {

    /**接收消息的方法*/
    public void receiveMessage(String message){
        System.out.println("收到一条消息："+message);
    }

}
