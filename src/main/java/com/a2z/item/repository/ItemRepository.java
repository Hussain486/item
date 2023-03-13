package com.a2z.item.repository;

import com.a2z.item.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ItemRepository extends MongoRepository<Item,Integer> {
}
