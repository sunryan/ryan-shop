package com.ryan.shop.config.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lr
 * @date 2018/1/17
 */
@RestController
public class TestControl {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello config";
    }
}
