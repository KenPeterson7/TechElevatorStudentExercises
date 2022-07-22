package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordCountTests {

    //created a new instance (object) of the WordCount Class
    WordCount wordCount = new WordCount();

    @Test
    public void get_count_for_ba_ba_black_sheep(){
        //instantiated new Map object and named it expectedResult
        Map<String, Integer> expectedResult = new HashMap<>();
        //added the test elements to the Map
        expectedResult.put("ba", 2);
        expectedResult.put("black", 1);
        expectedResult.put("sheep", 1);
        //Created a String array called actualResult to pass through the getCount method
        //and store it in wordCount variable for comparison
        String[] actualResult = {"ba", "ba", "black", "sheep"};
        assertEquals("incorrect array returned", expectedResult, wordCount.getCount(actualResult));
    }

    @Test
    public void get_count_for_a_b_a_c_b(){
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 2);
        expectedResult.put("b", 2);
        expectedResult.put("c", 1);
        String[] actualResult = {"a", "b", "a", "c", "b"};
        assertEquals("incorrect array returned", expectedResult, wordCount.getCount(actualResult));
    }

    @Test
    public void get_count_for_null_array(){
        Map<String, Integer> expectedResult = new HashMap<>();
        String[] actualResult = {};
        assertEquals("incorrect array returned", expectedResult, wordCount.getCount(actualResult));
    }

    @Test
    public void get_count_for_c_b_a(){
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 1);
        expectedResult.put("b", 1);
        expectedResult.put("c", 1);
        String[] actualResult = {"a", "b", "c"};
        assertEquals("incorrect array returned", expectedResult, wordCount.getCount(actualResult));
    }

    @Test
    public void get_count_for_a_b(){
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 5);
        expectedResult.put("b", 5);
        String[] actualResult = {"a", "a", "b", "a", "a", "b", "b", "a", "b", "b"};
        assertEquals("incorrect array returned", expectedResult, wordCount.getCount(actualResult));
    }
}
