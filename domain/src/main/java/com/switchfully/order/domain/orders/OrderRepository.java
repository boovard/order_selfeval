package com.switchfully.order.domain.orders;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private Map<Integer, Order> orderRepository;

    public OrderRepository() {
        this.orderRepository = new HashMap<>();
    }
}
