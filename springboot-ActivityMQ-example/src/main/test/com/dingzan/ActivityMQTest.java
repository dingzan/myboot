package com.dingzan;


import javax.jms.Destination;
 
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dingzan.producer.Producer;
 
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityMQTest {
	
	@Autowired
	private Producer producer;
	
	@Test
	public void queueTest() throws InterruptedException {
		Destination destination = new ActiveMQQueue("mytest.queue");
		for(int i=0; i<10; i++){
			producer.sendMessage(destination, "hello test-queue!!!");
		}
	}
	
}
