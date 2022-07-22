package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Tests {

     Lucky13 lucky13 = new Lucky13();

     @Test
    public void passing_0_2_4_values_happy_path(){
         //Arrange - arranging the conditions of the test, such as setting up test data.
         int[] nums = {0, 2, 4};
         assertTrue("this should return true", lucky13.getLucky(nums));
     }

     @Test
    public void passing_1_2_3_negativeTest(){
         int[] nums = {1, 2, 3};
         assertFalse("this should return false", lucky13.getLucky(nums));
     }

    @Test
    public void passing_1_2_4_negativeTest(){
        int[] nums = {1, 2, 4};
        assertFalse("this should return false", lucky13.getLucky(nums));
    }

    @Test
    public void passing_1_1_1_negativeTest(){
        int[] nums = {1, 1, 1};
        assertFalse("this should return false", lucky13.getLucky(nums));
    }

}
