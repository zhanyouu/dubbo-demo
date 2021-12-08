package com.dubbo.consumer.controller;

import com.dubbo.api.OrderService;
import com.dubbo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    @ResponseBody
    public String getOrderInfo() {
        String tranId =orderService.getOrderInfo();
        return tranId;
    }
}
