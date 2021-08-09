package com.shishi.rabbitmqexchangereceiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloExchangeReceive {

    @RabbitListener(queues="topic.message1")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("message1:"+str);
    }
    @RabbitListener(queues="topic.message2")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("message2:"+str);
    }
}
