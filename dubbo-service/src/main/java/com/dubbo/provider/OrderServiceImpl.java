package com.dubbo.provider;

import com.dubbo.api.OrderService;
import org.springframework.stereotype.Component;

public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderInfo() {
        return "123";
    }
}
