package com.shishi.controller;

import com.shishi.bean.HappyGirl;
import com.shishi.mapper.HappyGirlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HappyGirlMapper mapper;

    @RequestMapping("/insert")
    public String insert() {
        HappyGirl girl = new HappyGirl();
        girl.setHappyThing("hey");
        girl.setLikeWhat("sleep");
        girl.setId(3);
        mapper.insert(girl);
        return "success";
    }
    @RequestMapping("/delete")
    public int delete() {
        HappyGirl girl = new HappyGirl();
        girl.setId(1);
        int num = mapper.deleteById(girl);
        return num;
    }
}
