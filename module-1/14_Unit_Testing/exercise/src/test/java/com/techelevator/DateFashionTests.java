package com.techelevator;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateFashionTests {

     /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */

    //Arrange
    DateFashion dateFashion = new DateFashion();
    //Act
    //Assert
    @Test
    public void date_is_a_smokeshow_10(){
        assertEquals("Your date is a 10, you should get a table right away", 2, dateFashion.getATable(5, 10));
    }

    @Test
    public void date_is_ugly(){
        assertEquals("Your date is a 2, you shall not get a table", 0, dateFashion.getATable(5, 2));
    }

    @Test
    public void date_is_average(){
        assertEquals("Your date is average, you're maybe getting a table", 1, dateFashion.getATable(5, 5));
    }

    @Test
    public void date_is_hot_but_your_ugly(){
        assertEquals("Your date is hot, but you're ugly, so you shant get a table", 0, dateFashion.getATable(1, 9));
    }

    @Test
    public void date_is_an8_you_a_3(){
        assertEquals("Your date is hot, but you're ugly, so you shant get a table", 2, dateFashion.getATable(3, 8));
    }


}
