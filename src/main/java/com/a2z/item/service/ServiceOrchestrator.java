package com.a2z.item.service;

import com.a2z.item.model.Item;
import com.a2z.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrchestrator {

    @Autowired
    ItemRepository itemRepository;


    public void process(Item item) {
        itemRepository.save(item);
    }

    public List<Item> fetchItems() {
        return itemRepository.findAll();
    }

}
