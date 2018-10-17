package com.dingzan;


import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dingzan.producer.ProducerService;
 
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMQTest {
	
    Queue queue = new ActiveMQQueue("portal.admin.queue");
	
    Topic topic = new ActiveMQTopic("portal.admin.topic");
    
    Topic topic2 = new ActiveMQTopic("portal.admin.topic2");
    
    @Autowired
    private ProducerService producerService;

    @Test
    public void sendQueue(){
    	producerService.sendMessage(this.queue,"hello test-queue");
    }

    @Test
    public void sendTopic(){
    	producerService.sendMessage(this.topic,"hello test-topic");
    }
    
    @Test
    public void sendTopic2(){
    	producerService.sendMessage(this.topic2,"hello persist-topic");
    }
    

}
