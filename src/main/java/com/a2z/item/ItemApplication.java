package com.a2z.item;

import com.a2z.item.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

}
