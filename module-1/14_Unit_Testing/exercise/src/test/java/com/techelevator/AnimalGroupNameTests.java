package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalGroupNameTests {

    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "Herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * GetHerd("giraffe") → "Tower"
     * GetHerd("") -> "unknown"
     * GetHerd("walrus") -> "unknown"
     * GetHerd("Rhino") -> "Crash"
     * GetHerd("rhino") -> "Crash"
     * GetHerd("elephants") -> "unknown"
     *
     */

        //Arrange - arranging the conditions of the test, such as setting up test data.
        AnimalGroupName testMethods = new AnimalGroupName();
        //Act - perform the action of interest—meaning, the thing you're testing.

        //Assert - validate that the expected outcome occurred by means of an assertion—that is, a certain value was returned, or a file exists.

        //Indicates the method is a test method
        @Test
        //Test methods are always public, return void, and take no arguments.
        public void animal_test_for_Rhino(){
            //assertEquals methods passes the error message, then the expected result, then the actual result & compares the 2 results
            //for the actual result I passed the value Rhino into the getHerd method and stored it in the testMethods variable as the actual result
            assertEquals("Incorrect value returned for rhino", "Crash", testMethods.getHerd("Rhino"));
        }

        @Test
        public void animal_test_for_Giraffe(){
            assertEquals("Incorrect value returned for giraffe", "Tower", testMethods.getHerd("Giraffe"));
        }

        @Test
        public void animal_test_for_Elephant(){
            assertEquals("Incorrect value returned for elephant", "Herd", testMethods.getHerd("Elephant"));
        }

        @Test
        public void animal_test_for_Lion(){
        assertEquals("Incorrect value returned for lion", "Pride", testMethods.getHerd("Lion"));
        }

        @Test
        public void animal_test_for_Crow(){
            assertEquals("Incorrect value returned for crow", "Murder", testMethods.getHerd("Crow"));
        }

        @Test
        public void animal_test_for_Pigeon(){
            assertEquals("Incorect value returned for pigeon", "Kit", testMethods.getHerd("Pigeon"));
        }

        @Test
        public void animal_test_for_Flamingo(){
        assertEquals("Incorect value returned for flamingo", "Pat", testMethods.getHerd("Flamingo"));
        }

        @Test
        public void animal_test_for_Deer(){
        assertEquals("Incorect value returned for deer", "Herd", testMethods.getHerd("Deer"));
        }

        @Test
        public void animal_test_for_Dog(){
        assertEquals("Incorect value returned for dog", "Pack", testMethods.getHerd("Dog"));
    }

        @Test
        public void animal_test_forCrocs(){
            assertEquals("Incorrect value returned for crocodiles", "Float", testMethods.getHerd("Crocodile"));
        }

        @Test
        public void test_for_null(){
            assertEquals("Incorrect value null returned", "unknown", testMethods.getHerd(null));
        }

        @Test
        public void test_for_unknown_animal(){
            assertEquals("Incorrect value returned for unknown animal", "unknown", testMethods.getHerd("Liger"));
        }

}
