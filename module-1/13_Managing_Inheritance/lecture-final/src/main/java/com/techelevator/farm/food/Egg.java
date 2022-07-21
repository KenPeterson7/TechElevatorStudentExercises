package com.techelevator.farm.food;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;

public class Egg implements Sellable {
    private String name;
    private BigDecimal price;

    public Egg() {
        name = "Egg";
        price = new BigDecimal("0.25");
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
