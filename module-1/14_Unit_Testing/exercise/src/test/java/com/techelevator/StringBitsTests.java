package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

    StringBits stringBits = new StringBits();

    @Test
    public void hello_test_5_Chars(){
        String test = "Hello";
        Assert.assertEquals("This should yield Hlo", "Hlo", stringBits.getBits(test));
    }

    @Test
    public void hi_test_2_Chars(){
        String test = "Hi";
        Assert.assertEquals("This should yield H", "H", stringBits.getBits(test));
    }

    @Test
    public void hello_test_9_Chars(){
        String test = "Heeololeo";
        Assert.assertEquals("This should yield Hello", "Hello", stringBits.getBits(test));
    }

    @Test
    public void Cincinnati_test_10_Chars(){
        String test = "Cincinnati";
        Assert.assertEquals("This should yield Cnint", "Cnint", stringBits.getBits(test));
    }
}
