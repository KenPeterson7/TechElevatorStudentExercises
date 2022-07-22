package com.techelevator;

public class DateFashion {

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
    public int getATable(int you, int date) {
        //getTable variable assigned to a value of 1
        //average people chances
        int getTable = 1;

        //if your style is less than or equal to 2 or your dates style is less than or equal to 2..
        if (you <= 2 || date <= 2) {
            //you get noooo table
            getTable = 0;
            //your style is greater than or equal to an 8 or your dates style is greater than or equal to an 8
        } else if (you >= 8 || date >= 8) {
            //you get a table quick
            getTable = 2;
        }
        //returns your chances of getting a table as an int
        return getTable;
    }

}
