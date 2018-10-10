package com.dingzan.consumer;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
 
@Service
public class Consumer2 {
	
	@JmsListener(destination = "zh-topic",containerFactory = "topicContainerFactory2")
    @SendTo(value="return-queue")
    public String receiveQueue(String text) {
        System.out.println("Consumer2收到:"+text);
        return "Consumer2回复收到了!";
    }
}

