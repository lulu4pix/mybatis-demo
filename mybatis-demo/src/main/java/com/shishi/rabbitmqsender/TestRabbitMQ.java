package com.shishi.rabbitmqsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRabbitMQ {

    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/test")
    public String testRabbit() {
        helloSender.send();
        return "y";
    }
}