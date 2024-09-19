package com.collection.set.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.collection.set.model.Inventory;
import com.collection.set.model.Item;

@Configuration
public class AppConfig {

    // Define individual Item beans
    @Bean
    public Item item1() {
        return new Item("Laptop", 1500.00);
    }

    @Bean
    public Item item2() {
        return new Item("Smartphone", 800.00);
    }

    @Bean
    public Item item3() {
        return new Item("Headphones", 100.00);
    }

    // Define a Set of Items
    @Bean
    public Set<Item> itemSet() {
        Set<Item> items = new HashSet<>();
        items.add(item1());
        items.add(item2());
        items.add(item3());
        return items;
    }

    // Define Inventory bean that takes a Set of Items
    @Bean
    public Inventory inventory() {
        return new Inventory(itemSet());
    }
}
