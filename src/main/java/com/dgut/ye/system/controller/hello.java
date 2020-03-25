package com.dgut.ye.system.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DGUT.YE
 * @date : 2020/03/24
 **/
@RestController
public class hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
