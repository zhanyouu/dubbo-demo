package com.dubbo.consumer.controller;

import com.dubbo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userService.sayHello(name);
        return welcome;
    }
    @RequestMapping("/getName")
    @ResponseBody
    public String getName(String name) {
        String welcome = userService.getUserName(name);
        return welcome;
    }
}
