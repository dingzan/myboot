package com.dingzan.consumer;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
 
@Service
public class Consumer2 {
    
    
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "portal.admin.topic",containerFactory = "jmsListenerContainerTopic") 
	public void receivetopic(String text) {
		System.out.println("Consumer2收到的topic报文为:"+text);
	}
	
}