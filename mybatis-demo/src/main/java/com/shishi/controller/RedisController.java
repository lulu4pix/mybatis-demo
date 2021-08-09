package com.shishi.controller;

import com.shishi.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/set")
    public String setString(String key, String value) {
        redisService.set(key, value);
        return "ok";
    }

    @RequestMapping("/hasKey/{key}")
    public boolean hasKey(@PathVariable String key) {
        return redisService.hasKey(key);
    }

    @RequestMapping("/delKey/{key}")
    public void delKey(@PathVariable String key) {
        redisService.delete(key);
    }

    @RequestMapping("/getKey/{key}")
    public Object get(@PathVariable String key) {
        return redisService.get(key);
    }
}
