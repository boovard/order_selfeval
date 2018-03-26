package com.switchfully.order.domain.orders;

import com.switchfully.order.domain.items.Item;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemGroup {

    private Item item;
    private Integer amountOfItems;
    private BigDecimal totalGroupPrice;
    private LocalDate shippingDate;
}
