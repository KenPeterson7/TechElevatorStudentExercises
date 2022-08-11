package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FlowerShopTest {



    @Test
    public void getSubtotal() {
    }

    @Test
    public void deliveryTotal_sameDay_false_and_zipCode_20000_returns_3_99() {
        FlowerShop flowerShop = new FlowerShop("string", 1);
        BigDecimal expected = new BigDecimal("3.99");
        BigDecimal actual = flowerShop.deliveryTotal(false, "20000");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deliveryTotal_SameDay_true_and_zipCode_20000_returns_9_98(){
        FlowerShop flowerShop = new FlowerShop("string", 12);
        BigDecimal expected = new BigDecimal("9.98");
        BigDecimal actual = flowerShop.deliveryTotal(true, "20000");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deliveryTotal_SameDay_false_and_zipCode_30000_returns_6_99(){
        FlowerShop flowerShop = new FlowerShop("string", 12);
        BigDecimal expected = new BigDecimal("6.99");
        BigDecimal actual = flowerShop.deliveryTotal(false, "30010");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deliveryTotal_SameDay_true_and_zipCode_20000_returns_0(){
        FlowerShop flowerShop = new FlowerShop("string", 12);
        BigDecimal expected = new BigDecimal("0.00");
        BigDecimal actual = flowerShop.deliveryTotal(false, "10000");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deliveryTotal_SameDay_true_and_zipCode_70000_returns_19_99(){
        FlowerShop flowerShop = new FlowerShop("string", 12);
        BigDecimal expected = new BigDecimal("19.99");
        BigDecimal actual = flowerShop.deliveryTotal(true, "70000");
        Assert.assertEquals(expected, actual);

    }

}