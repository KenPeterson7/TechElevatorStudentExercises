package com.techelevator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Less20Tests {

    Less20 less20 = new Less20();

    @Test
    public void passing_18_as_a_value_test(){
        assertTrue("This should return true", less20.isLessThanMultipleOf20(18));
    }

    @Test
    public void passing_19_as_a_value_test(){
        assertTrue("This should return true", less20.isLessThanMultipleOf20(19));
    }

    @Test
    public void passing_20_as_a_value_test(){
        assertFalse("This should return false", less20.isLessThanMultipleOf20(20));
    }

    @Test
    public void passing_58_as_a_value_test(){
        assertTrue("This should return true", less20.isLessThanMultipleOf20(58));
    }

    @Test
    public void passing_17_as_a_value_test(){
        assertFalse("This should return false", less20.isLessThanMultipleOf20(17));
    }

    @Test
    public void passing_0_as_a_value_test(){
        assertEquals("This should return false", false, less20.isLessThanMultipleOf20(0));
    }

}
