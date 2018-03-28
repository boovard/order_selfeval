package com.switchfully.order.domain.orders;

import com.switchfully.order.domain.customers.Customer;
import com.switchfully.order.domain.items.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long orderId;
    private Customer customer;
    private List<ItemGroup> itemGroups;
    private BigDecimal totalPrice;
    private static Long orderCount = 0L;

    private Order(){}

    public Order(Customer customer, List<ItemGroup> itemGroups) {
        this.orderId = orderCount;
        this.customer = customer;
        this.itemGroups = new ArrayList<>();
        this.totalPrice = calculateTotalPrice(itemGroups);
    }

    private static BigDecimal calculateTotalPrice(List<ItemGroup> itemGroups){
        BigDecimal totalPrice = new BigDecimal(0);
        for (ItemGroup itemGroup : itemGroups){
            totalPrice.add(itemGroup.getTotalGroupPrice());
        }
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ItemGroup> getItemGroups() {
        return itemGroups;
    }

    private void setItemGroups(List<ItemGroup> itemGroups) {
        this.itemGroups = itemGroups;
    }

    public static class OrderBuilder{
        private Customer customer;
        private List<ItemGroup> itemGroups;

        private OrderBuilder(){}

        public static OrderBuilder orderBuilder(){
            return new OrderBuilder();
        }

        public Order buid(){
            Order order = new Order();
            order.setCustomer(customer);
            order.setItemGroups(itemGroups);
            return order;
        }

        public OrderBuilder withCustomer(Customer customer){
            this.customer = customer;
            return this;
        }

        public OrderBuilder withItemGroups(List<ItemGroup> itemGroups){
            this.itemGroups = itemGroups;
            return this;
        }
    }
}
