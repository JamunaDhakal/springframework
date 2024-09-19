package com.collection.set.model;

import java.util.Set;

public class Inventory {
    private Set<Item> items;
    
   // Constructor
    public Inventory() {}

    // Constructor with Set<Item> argument
    public Inventory(Set<Item> items) {
        this.items = items;
    }

    // Getters and Setters
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }
}