package com.switchfully.order.domain.items;

import java.math.BigDecimal;

public class Item {

    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer amount;
    private static Integer counter = 1;

    private Item(){
    }

    public Item(String name, String description, BigDecimal price) {
        this.id = counter++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void updateItem(Item newItem) {
        if(newItem.getName() != null){
            name = newItem.getName();
        }
        if(newItem.getDescription() != null){
            description = newItem.getDescription();
        }
        if (newItem.getPrice() != null){
            price = newItem.getPrice();
        }
        if (newItem.getAmount() != null){
            amount = newItem.getAmount();
        }
    }

    public static class ItemBuilder{
        private Integer id;
        private String name;
        private String description;
        private BigDecimal price;
        private Integer amount;

        private ItemBuilder(){}

        public static ItemBuilder item(){
            return new ItemBuilder();
        }

        public Item build(){
            Item item = new Item();
            item.setId(id);
            item.setName(name);
            item.setDescription(description);
            item.setPrice(price);
            item.setAmount(amount);
            return item;
        }

        public ItemBuilder withId(Integer id){
            this.id = id;
            return this;
        }

        public ItemBuilder withName(String name){
            this.name = name;
            return this;
        }

        public ItemBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public ItemBuilder withPrice(BigDecimal price){
            this.price = price;
            return this;
        }

        public ItemBuilder withAmount(Integer amount){
            this.amount = amount;
            return this;
        }
    }
}
