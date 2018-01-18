package com.ryan.shop.gateway.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author lr
 * @date 2018/1/17
 */
@RestController
public class ConfigTest {
    
    @Value("${test}")
    private String test;
   
    @RequestMapping("/hello")
    public String hello(){
        return "helo  " + test;
    }
}
