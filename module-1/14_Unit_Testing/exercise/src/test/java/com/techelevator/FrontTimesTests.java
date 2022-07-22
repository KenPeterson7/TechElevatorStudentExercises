package com.techelevator;

import org.junit.Test;
import static org.junit.Assert.*;

public class FrontTimesTests {

    FrontTimes frontTimes = new FrontTimes();

    @Test
    public void passing_chocolate_twice_test(){
        assertEquals("This string should print out ChoChoCho", "ChoCho", frontTimes.generateString("Chocolate", 2));
    }

    @Test
    public void passing_chocolate_three_test(){
        assertEquals("This should print out ChoChoCho", "ChoChoCho", frontTimes.generateString("Chocolate", 3));
    }

    @Test
    public void passing_Abc_four_times(){
        assertEquals("This should print out AbcAbcAbcAbc", "AbcAbcAbcAbc", frontTimes.generateString("Abc", 4));
    }

    @Test
    public void passing_z_5_times(){
        assertEquals("This should print out zzzzz", "zzzzz", frontTimes.generateString("z", 5));
    }

    @Test
    public void passing_null(){
        assertEquals("This should print out null", "", frontTimes.generateString(null, 5));
    }
}
