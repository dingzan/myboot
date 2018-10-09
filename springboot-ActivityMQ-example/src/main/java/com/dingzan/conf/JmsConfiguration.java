package com.dingzan.conf;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * 1,实现了生产者两种消息类型 点对点 发布/订阅两者的 兼容模式
 * 2,实现持久化订阅
 * @author dingzan
 *
 */
@Configuration
@EnableJms
public class JmsConfiguration {
	
    /**
     * topic模式的ListenerContainer
     * @param activeMQConnectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        /**
         * 使用消息转换器
         */
        //bean.setMessageConverter(jacksonJmsMessageConverter());
        return bean;
    }
    
    /**
     * queue模式的ListenerContainer
     * @param activeMQConnectionFactory
     * @return
     */
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setConnectionFactory(activeMQConnectionFactory);
        /**
         * 使用消息转换器
         */
        //bean.setMessageConverter(jacksonJmsMessageConverter());
        return bean;
    }
    
    
    @Bean(name = "topicContainerFactory1")
    public DefaultJmsListenerContainerFactory topicClient1(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer){
        DefaultJmsListenerContainerFactory factory = defaultJmsListenerContainerFactoryTopic(connectionFactory,configurer);
        factory.setClientId("10001");
        return factory;
    }

    @Bean(name = "topicContainerFactory2")
    public DefaultJmsListenerContainerFactory topicClient2(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer){
        DefaultJmsListenerContainerFactory factory = defaultJmsListenerContainerFactoryTopic(connectionFactory,configurer);
        factory.setClientId("10002");
        return factory;
    }

    public DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactoryTopic(ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory,connectionFactory);
        factory.setPubSubDomain(true);
        factory.setSessionTransacted(true);
        factory.setAutoStartup(true);
        //开启持久化订阅
        factory.setSubscriptionDurable(true);
        return factory;
    }
    
    //减少重复创建session的问题
    @Bean(name = "myJmsTemplate")
    public JmsTemplate getJmsTemplate(ActiveMQConnectionFactory nonXaJmsConnectionFactory){
        //使用CachingConnectionFactory可以提高部分性能。
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setSessionCacheSize(100);
        cachingConnectionFactory.setTargetConnectionFactory(nonXaJmsConnectionFactory);
        JmsTemplate jmsTemplate = new JmsTemplate(cachingConnectionFactory);
        //设置deliveryMode（持久化）, priority, timeToLive必须开启
        jmsTemplate.setExplicitQosEnabled(true);
        // 设置消息是否持久化
        jmsTemplate.setDeliveryPersistent(true);
        // 设置消息转换器
        //jmsTemplate.setMessageConverter(jacksonJmsMessageConverter);
        // 设置消息是否以事务
        jmsTemplate.setSessionTransacted(true);
        return jmsTemplate;
    }
    
    /**
     * 消息转换器
     * @return
     */
//    @Bean
//    public MessageConverter jacksonJmsMessageConverter() {
//        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//        converter.setTargetType(MessageType.TEXT);
//        converter.setTypeIdPropertyName("_type");
//        return converter;
//    }
}
