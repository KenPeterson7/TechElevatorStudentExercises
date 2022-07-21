package com.techelevator.farm.finance;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;

public class AdmissionTicket implements Sellable {
    private String name;
    private BigDecimal price;

    public AdmissionTicket(int age){
        if(age < 18){
            name = "Child Admission";
            price = new BigDecimal("9.99");
        }
        else if(age < 65){
            name = "Adult Admission";
            price = new BigDecimal("15.99");
        }
        else{
            name = "Senior Admission";
            price = new BigDecimal("12.99");
        }
    }

    public String getName(){
        return  name;
    }

    public BigDecimal getPrice(){
        return price;
    }
}
