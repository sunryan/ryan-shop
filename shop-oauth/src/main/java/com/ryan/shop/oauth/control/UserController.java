package com.ryan.shop.oauth.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 *
 * @author lr
 * @date 2018/1/18
 */
@RestController
public class UserController {
    
    
    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
