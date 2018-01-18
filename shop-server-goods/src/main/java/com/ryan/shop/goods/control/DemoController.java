package com.ryan.shop.goods.control;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 * @author lr
 * @date 2018/1/18
 */
@RestController
public class DemoController {
    
    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('query-demo')")
    public String getDemo(){
        return "query-demo";
    }
    
    @GetMapping("/demo1")
    public String getDemo1(){
        return "good";
    }
}
