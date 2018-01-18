package com.ryan.shop.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 *
 * @author lr
 * @date 2018/1/17
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GoodsServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(GoodsServerApplication.class, args);
    }
}
