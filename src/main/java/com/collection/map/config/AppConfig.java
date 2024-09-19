package com.collection.map.config;

import java.util.HashMap;
import java.util.Map;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.collection.map.model.Inventory;
import com.collection.map.model.Item;
import com.collection.map.model.Supplier;

@Configuration
public class AppConfig {

    // Define Supplier beans
    @Bean
    public Supplier supplier1() {
        return new Supplier("S1", "Supplier One");
    }

    @Bean
    public Supplier supplier2() {
        return new Supplier("S2", "Supplier Two");
    }

    // Define Item beans
    @Bean
    public Item item1() {
        return new Item("I1", "Laptop", 1500.00);
    }

    @Bean
    public Item item2() {
        return new Item("I2", "Smartphone", 800.00);
    }

    @Bean
    public Item item3() {
        return new Item("I3", "Headphones", 100.00);
    }

    // Define a Map of Items by Supplier ID
    @Bean
    public Map<String, Item> itemsBySupplier() {
        Map<String, Item> itemsBySupplier = new HashMap<>();
        itemsBySupplier.put(supplier1().getId(), item1());
        itemsBySupplier.put(supplier2().getId(), item2());
        itemsBySupplier.put(supplier1().getId(), item3()); 
        return itemsBySupplier;
    }

    // Define Inventory bean that takes a Map of Items by Supplier ID
    @Bean
    public Inventory inventory() {
        return new Inventory(itemsBySupplier());
    }
}
