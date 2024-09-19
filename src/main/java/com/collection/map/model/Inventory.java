package com.collection.map.model;

import java.util.Map;

public class Inventory {
    private Map<String, Item> itemsBySupplier;
    
    public Inventory() {}

    // Constructor
    public Inventory(Map<String, Item> itemsBySupplier) {
        this.itemsBySupplier = itemsBySupplier;
    }

    // Getter and Setter
    public Map<String, Item> getItemsBySupplier() {
        return itemsBySupplier;
    }

    public void setItemsBySupplier(Map<String, Item> itemsBySupplier) {
        this.itemsBySupplier = itemsBySupplier;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itemsBySupplier=" + itemsBySupplier +
                '}';
    }
	

}
