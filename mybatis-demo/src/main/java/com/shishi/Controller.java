package com.shishi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/all")
    public String getAll() {
        return "hello";
    }
}
