package com.switchfully.order.service;

import com.switchfully.order.domain.items.Item;
import com.switchfully.order.domain.items.ItemRepository;

import javax.inject.Named;

@Named
public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item){
        return itemRepository.addItem(item);
    }

    public Item updateItem(Item item){
        Item itemInRepo = itemRepository.getItem(item);
        if (itemRepository.getItem(item) == null){
            throw new IllegalArgumentException("I'LL HAVE TO CHANGE THIS EXCEPTION");
        }

        itemInRepo.updateItem(item);
        return itemRepository.updateItem(itemInRepo);
    }
}
