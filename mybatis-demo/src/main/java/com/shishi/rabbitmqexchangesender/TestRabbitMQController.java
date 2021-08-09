package com.shishi.rabbitmqexchangesender;

import com.shishi.rabbitmqsender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRabbitMQController {

    @Autowired
    private HelloExchangeSender sender;

    @RequestMapping("/exchange")
    public String testRabbit() {
        sender.send();
        return "yy";
    }
}