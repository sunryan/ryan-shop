package com.ryan.shop.oauth.service.security;

import com.ryan.shop.oauth.entity.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.ryan.shop.entity.User;

/**
 *
 * @author lr
 * @date 2018/1/18
 */
@Service
public class DomainUserDetailsService implements UserDetailsService {
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("===================获取到token已进入自定义验证："+username);
        // 可以进行数据库请求，这里进行模拟
        User user = new User();
        user.setUsername("admin");
        user.setPassword("$2a$10$4gD/QaH0fjy0cMJFwbQF6evGNw1LS9yTGT9BtyyHeDfVVTd1QSYOC");
        if (user == null) {
            throw new UsernameNotFoundException("Could not find the user '" + username + "'");
        }
        return new CustomUserDetails(user, true, true, true, true, null);
    }
}
