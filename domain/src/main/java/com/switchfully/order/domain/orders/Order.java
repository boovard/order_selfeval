package com.switchfully.order.domain.orders;

import com.switchfully.order.domain.customers.Customer;
import com.switchfully.order.domain.items.Item;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

    private Long orderId;
    private Customer customer;
    private Item item;
    private BigDecimal amount;
    private LocalDate shippingDate;
    private static Long orderCount = 0L;

    public Order(Customer customer, Item item, BigDecimal amount, LocalDate shippingDate) {
        this.orderId = orderCount++;
        this.customer = customer;
        this.item = item;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }
}
