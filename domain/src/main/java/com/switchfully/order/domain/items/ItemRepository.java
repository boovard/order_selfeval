package com.switchfully.order.domain.items;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
public class ItemRepository {

    private Map<Integer, Item> itemRepository;

    public ItemRepository(){
        this.itemRepository = new HashMap<Integer, Item>();
    }

    public Item addItem(Item item){
        return itemRepository.put(item.getId(), item);
    }

    public Item updateItem(Item item){
        return updateItem(item);
    }

    public Item getItem(Item item){
        return itemRepository.get(item.getId());
    }


}
