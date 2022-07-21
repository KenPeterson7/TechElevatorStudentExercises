package com.techelevator.farm.finance;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AdmissionTicketTest {
//test for 0 age
    //test negative age
    //Test if Age is 18 then the ticket should be for adult and should cost 15.99
    @Test
    public void priceShouldBe1599WhenTheAgeIs18(){
        //arrange
        int age = 18;
        BigDecimal expectedPrice = new BigDecimal("15.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "Because once you're 18 you're grown";

        //act
        BigDecimal actualPrice = ticket.getPrice();

        //assert
        assertEquals(message, expectedPrice, actualPrice);
    }
    //Test if Age is 40 then the ticket should be for an adult and the coast should be 15.99
    //Test if Age is 10 then the ticket should be for a child and the cost should 9.99
    @Test
    public void priceShouldBe999WhenAgeIs10(){
        //arrange
        int age = 10;
        BigDecimal expectedPrice = new BigDecimal("9.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "Because kids should be cheaper than everyone else.";
        //act
        BigDecimal actualPrice = ticket.getPrice();
        //assert
        assertEquals(message, expectedPrice, actualPrice);
    }


    //Test if the Age is 69 then ticket should be for a senior and cost 12.99
}
