package com.shishi;

import com.shishi.Mapper.WalleMapper;
import com.shishi.beans.Walle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Controller {

    @Resource
    private WalleMapper mapper;

    @RequestMapping("/all")
    public List<Walle> findAll() {
        return mapper.findAll();
    }
}
