package com.dingzan.consumer;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
 
@Service
public class Consumer1 {
    
	// 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "portal.admin.queue",containerFactory = "jmsListenerContainerQueue") 
    @SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.println("Consumer1收到queue:"+text);
        return "Consumer1回复收到了!";
    }

	
    @JmsListener(destination = "portal.admin.topic",containerFactory = "jmsListenerContainerTopic") 
	public void receivetopic(String text) {
		System.out.println("Consumer1收到的topic报文为:"+text);
	}
    
}