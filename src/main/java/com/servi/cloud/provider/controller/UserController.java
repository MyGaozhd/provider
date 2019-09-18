package com.servi.cloud.provider.controller;


import com.servi.cloud.provider.entry.User;
import com.servi.cloud.provider.redis.ICache;
import com.servi.cloud.provider.redis.RedisCache;
import com.servi.cloud.provider.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;
    @Autowired
    private ICache cache;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id) {
        log.error("findUserById:" + id);
        User user = cache.get(id+"");
        if (user == null){
            user=userService.findUserById(id);
            cache.add(id+"",user);
        }
        System.out.println("9003");
        return user;
    }

    @GetMapping("/adduser")
    public void adduser() {
        User user = new User();
        user.setId(2);
        user.setName(2 + "kk");
        user.setSex(1 + "");
        userService.insert(user);
    }

    @GetMapping("/addusers/{id}")
    public String addusers(@PathVariable int id) {
        List<User> users = new ArrayList<>();
        for (int a = 0; a < 50; a++) {
            int i = a + id;
            User user = new User();
            user.setUsercode("code" + i);
            user.setUsercode1("code" + i + "_1");
            user.setName("gzd" + i);
            user.setName1("gzd" + i + "_1");
            user.setSex((i % 2) + "");
            user.setAge(i % 100);
            user.setPhone("" + i);
            user.setAdress("北京市海淀区用友软件园E" + i);
            user.setEmail(i + "@yonyou.com");
            users.add(user);
        }

        userService.insertbatch(users);
        return "success";
    }

    @GetMapping("/gettest")
    public String redisTest() {

        return  ((RedisCache)cache).getString("a");
    }
}
