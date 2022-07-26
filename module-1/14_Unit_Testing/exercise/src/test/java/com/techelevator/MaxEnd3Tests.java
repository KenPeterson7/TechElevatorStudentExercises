package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class MaxEnd3Tests {

    MaxEnd3 maxend3 = new MaxEnd3();

   // public void assertEqualsArray(String string, int[] arrayExpected, int[] testArray) {}

    @Test
    public void passing_Last_Element_Larger_test(){
        int[] arrayExpected = {3, 3, 3};
        int[] testArray = {1, 2, 3};
        assertArrayEquals("This should return the value of the last element 3 times", arrayExpected, maxend3.makeArray(testArray));
    }

    @Test
    public void passing_First_Element_Larger_test(){
        int[] arrayExpected = {11, 11, 11};
        int[] testArray = {11, 5, 9};
        assertArrayEquals("This should return the value of the first element 3 times", arrayExpected, maxend3.makeArray(testArray));
    }

    @Test
    public void passing_Middle_Element_Larger_test(){
        int[] arrayExpected = {3, 3, 3};
        int[] testArray = {2, 11, 3};
        assertArrayEquals("This should return the value of the last element 3 times", arrayExpected, maxend3.makeArray(testArray));
    }

    @Test
    public void passing_0_values(){
        int[] arrayExpected = {0, 0, 0};
        int[] testArray = {0, 0, 0};
        assertArrayEquals("This should return 0 3 times", arrayExpected, maxend3.makeArray(testArray));
    }

    @Test
    public void testing_negative_values(){
        int[] arrayExpected = {5, 5, 5};
        int[] testArray = {-5, 15, 5};
        assertArrayEquals("This should return the value of the last element 3 times", arrayExpected, maxend3.makeArray(testArray));
    }

}
