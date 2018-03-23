package com.switchfully.order.domain.items;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {

    private Map<Integer, Item> itemRepository;

    public ItemRepository(){
        this.itemRepository = new HashMap<Integer, Item>();
    }

    public Item addItem(Item item){
        return itemRepository.put(item.getId(), item);
    }


}
