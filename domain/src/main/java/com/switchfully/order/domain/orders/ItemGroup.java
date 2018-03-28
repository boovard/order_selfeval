package com.switchfully.order.domain.orders;

import com.switchfully.order.domain.items.Item;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemGroup {

    private Item item;
    private Integer amountOfItems;
    private BigDecimal totalGroupPrice;
    private LocalDate shippingDate;

    private ItemGroup() {
    }

    public ItemGroup(Item item, Integer amountOfItems) {
        this.item = item;
        this.amountOfItems = amountOfItems;
        this.totalGroupPrice = calculateTotalGroupPrice(item, amountOfItems);
        this.shippingDate = calculateShippingDate(item);
    }

    private static BigDecimal calculateTotalGroupPrice(Item item, Integer amountOfItems){
        return item.getPrice().multiply(new BigDecimal(amountOfItems));
    }

    private static LocalDate calculateShippingDate(Item item) {
        if (item.getAmount() != null) {
            return LocalDate.now().plusDays(1);
        }
        else {
            return LocalDate.now().plusDays(7);
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmountOfItems() {
        return amountOfItems;
    }

    public void setAmountOfItems(Integer amountOfItems) {
        this.amountOfItems = amountOfItems;
    }

    public BigDecimal getTotalGroupPrice() {
        return totalGroupPrice;
    }

    public void setTotalGroupPrice(BigDecimal totalGroupPrice) {
        this.totalGroupPrice = totalGroupPrice;
    }

    public static class ItemGroupBuilder{
        private Item item;
        private Integer amountOfItems;

        private ItemGroupBuilder(){}

        public static ItemGroupBuilder itemGroup(){
            return new ItemGroupBuilder();
        }

        public ItemGroup build(){
            ItemGroup itemGroup = new ItemGroup();
            itemGroup.setItem(item);
            itemGroup.setAmountOfItems(amountOfItems);
            return itemGroup;
        }

        public ItemGroupBuilder withItem(Item item){
            this.item = item;
            return this;
        }

        public ItemGroupBuilder withAmountOfItem(Integer amountOfItem){
            this.amountOfItems = amountOfItem;
            return this;
        }
    }
}
