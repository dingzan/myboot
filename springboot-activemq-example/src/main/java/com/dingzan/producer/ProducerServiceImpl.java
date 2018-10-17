package com.dingzan.producer;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Override
    public void sendMessage(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination,message);
    }

    @JmsListener(destination = "out.queue",containerFactory = "jmsListenerContainerQueue")
    public void Message(String message){
        System.out.println("Product收到:"+message);
    }
}
