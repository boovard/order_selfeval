package com.switchfully.order.api.items;

public class ItemDto {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer amount;

    public static ItemDto itemDto(){
        return new ItemDto();
    }

    public Integer getId() {
        return id;
    }

    public ItemDto withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemDto withName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDto withDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ItemDto withPrice(Double price) {
        this.price = price;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public ItemDto withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
}
