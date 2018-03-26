package com.switchfully.order.api.items;

import com.switchfully.order.domain.items.Item;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
public class ItemMapper {

    ItemDto toDto(Item item){
        return ItemDto.itemDto()
                .withId(item.getId())
                .withName(item.getName())
                .withDescription(item.getDescription())
                .withPrice(item.getPrice().doubleValue())
                .withAmount(item.getAmount());
    }

    Item toDomain(ItemDto itemDto){
        return Item.ItemBuilder.item()
                .withName(itemDto.getName())
                .withDescription(itemDto.getDescription())
                .withPrice(BigDecimal.valueOf(itemDto.getPrice()))
                .withAmount(itemDto.getAmount())
                .build();
    }
}
