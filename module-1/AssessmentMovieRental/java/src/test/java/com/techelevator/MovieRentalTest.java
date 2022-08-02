package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieRentalTest {

    MovieRental movieRental = new MovieRental("Godfather", "DVD", true);

    @Test
    public void getRentalPriceTest() {
        Assert.assertEquals("That's not the right price", 1.99, movieRental.rentalPrice, 2);
    }

    @Test
    public void lateFeeTest(){
            Assert.assertEquals("That's not the right late fee", 1.99, movieRental.lateFee(1), 2);
        }
}