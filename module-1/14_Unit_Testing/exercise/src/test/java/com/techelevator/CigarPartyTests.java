package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTests {

     /*
     When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     there is no upper bound on the number of cigars. Return true if the party with the given values is
     successful, or false otherwise.
     haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
     */

    //Arrange - arranging the conditions of the test, such as setting up test data.
    CigarParty testParty = new CigarParty();
    //Act - perform the action of interest—meaning, the thing you're testing.

    //Assert - validate that the expected outcome occurred by means of an assertion—that is, a certain value was returned, or a file exists.

    @Test
    public void cigar_party_30_cigs(){
        assertFalse("You should not be able to get in the party", testParty.haveParty(30, false));
    }

    @Test
    public void cigar_party_50_Cigs(){
        assertTrue("You should be able to get into the party, something went wrong", testParty.haveParty(50, false));
    }

    @Test
    public void cigar_party_60_Cigs(){
        assertTrue("You should be able to get into the party, something went wrong", testParty.haveParty(60, false));
    }

    @Test
    public void cigar_party_61_cigs(){
        assertFalse("You should not be able to get in the party", testParty.haveParty(61, false));
    }

    @Test
    public void cigar_party_70_cigs_weekend(){
        assertEquals("You should get into that party, something went wrong!", true, testParty.haveParty(70, true) );
    }
}
