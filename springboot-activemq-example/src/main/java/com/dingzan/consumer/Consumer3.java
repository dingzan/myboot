package com.dingzan.consumer;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
 
@Service
public class Consumer3 {
    
	@JmsListener(destination = "portal.admin.topic2",containerFactory = "topicContainerFactory1") // 监听指定消息主题 
	public void receiveMessage1(String message) throws Exception { 
		System.out.println("[订阅1] [收到消息] {}"+message); 
	} 
	
	@JmsListener(destination = "portal.admin.topic2",containerFactory = "topicContainerFactory2") // 监听指定消息主题 
	public void receiveMessage2(String message) throws Exception { 
		System.out.println("[订阅2] [收到消息] {}"+message); 
	}
    
}