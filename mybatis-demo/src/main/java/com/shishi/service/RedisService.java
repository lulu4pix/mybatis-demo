package com.shishi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean set(String key, Object val) {
        try {
            redisTemplate.opsForValue().set(key, val);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
