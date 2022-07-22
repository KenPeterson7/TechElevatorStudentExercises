package com.techelevator;

public class CigarParty {

    /*
     When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     there is no upper bound on the number of cigars. Return true if the party with the given values is
     successful, or false otherwise.
     haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
     */
    public boolean haveParty(int cigars, boolean isWeekend) {
        //instance vars
        int minimumCigarCount = 40;
        int maximumCigarCount = 60;

        //this boolean is true if cigars are greater than 40
        boolean hasMinimumCigars = cigars >= minimumCigarCount;
        //this boolean is true if it's not the weekend & cigars are less than or equal to 60, or it's the weekend
        boolean withinMaxRangeOfCigars = (!isWeekend && cigars <= maximumCigarCount) || isWeekend;
        //this boolean is true when both booleans above are true, else it stores false
        boolean successful = hasMinimumCigars && withinMaxRangeOfCigars;

        //returns whatever value successful is  storing
        return successful;
    }

}
