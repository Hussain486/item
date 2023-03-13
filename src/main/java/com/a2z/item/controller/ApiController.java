package com.a2z.item.controller;

import com.a2z.item.model.Item;
import com.a2z.item.service.ServiceOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/a2z/")
public class ApiController {



    @Autowired
    ServiceOrchestrator serviceOrchestrator;

    @PostMapping(path = "item/createItem/", consumes = "application/json", produces = "application/json")
    public List<Item> createItems(@RequestBody Item item) {

        serviceOrchestrator.process(item);
        return serviceOrchestrator.fetchItems();
    }

    @GetMapping(path = "item/getItems/")
    public List<Item> getItems() {
        return serviceOrchestrator.fetchItems();
    }



}
