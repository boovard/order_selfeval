package com.switchfully.order.domain.orders;

import com.switchfully.order.domain.customers.Customer;
import com.switchfully.order.domain.items.Item;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long orderId;
    private Customer customer;
    private List<ItemGroup> items;
    private BigDecimal totalPrice;
    private LocalDate shippingDate;
    private static Long orderCount = 0L;

    public Order(Customer customer, Item item, BigDecimal totalPrice, LocalDate shippingDate) {
        this.orderId = orderCount++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalPrice = totalPrice;
        this.shippingDate = shippingDate;
    }
}
