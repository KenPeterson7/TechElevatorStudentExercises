package com.techelevator;

import java.util.*;

public class Inventory {

    private Map<String, Integer> products;

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public void putItemInInventory(String itemName, int quantity){
        products.put(quantity);
    }

    public void displayInventoryItemsWithQuantity(){
        for(Map.Entry<String, Integer> item: products.entrySet()){
            System.out.println(item.getKey() + " ");
            System.out.println(item.getValue());
        }
    }
}
