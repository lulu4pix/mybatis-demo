package com.shishi.controller;

import com.shishi.Mapper.WalleMapper;
import com.shishi.beans.Walle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MybatisController {

    @Resource
    private WalleMapper mapper;

    @RequestMapping("/all")
    public List<Walle> findAll() {
        return mapper.findAll();
    }


    // 测试所有
    @RequestMapping("/findCidRange")
    public List<Walle> findCidRange( int cid) {
        return mapper.findCidRange(cid);
    }

    @RequestMapping("/findByCid")
    public Walle findByCid( int cid) {
        return mapper.findByCid(cid);
    }

    @RequestMapping("/deleteOne")
    public void deleteOne(int cid) {
         mapper.deleteOne(cid);
    }

    @RequestMapping("/insertOne")
    public void insertOne(Walle walle) {
        mapper.insertOne(walle);
    }

    @RequestMapping("/updateOne")
    public void updateOne(Walle walle) {
        mapper.updateOne(walle);
    }
}
