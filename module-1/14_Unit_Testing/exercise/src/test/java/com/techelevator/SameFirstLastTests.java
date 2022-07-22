package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class SameFirstLastTests {

    SameFirstLast sameFirstLast = new SameFirstLast();

    @Test
    public void first_and_last_element_not_equal(){
        int[] nums = {1, 2, 3};
        Assert.assertFalse("This should return false", sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void first_and_last_element_are_equal_4(){
        int[] nums = {1, 2, 3, 1};
        Assert.assertTrue("This should return true", sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void first_and_last_element_are_equal_3(){
        int[] nums = {1, 2, 1};
        Assert.assertTrue("This should return true", sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void empty_array_test(){
        int[] nums = {};
        Assert.assertFalse("This should return false", sameFirstLast.isItTheSame(nums));
    }
    
}
