package com.shishi.rabbitmqexchangesender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HelloExchangeSender {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("exchange","topic.message1","hello,rabbit~~~11");
        template.convertAndSend("exchange","topic.message2","hello,rabbit~~~22");
    }
}