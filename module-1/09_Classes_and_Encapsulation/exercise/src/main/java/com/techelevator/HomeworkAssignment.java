package com.techelevator;

public class HomeworkAssignment {
    /*
     * - `letterGrade` is a derived attribute that's calculated using
     * `earnedMarks` and `possibleMarks`:
     * For 90% or greater, it returns "A"
     * For 80-89%, it returns "B"
     * For 70-79%, it returns "C"
     * For 60-69%, it returns "D"
     * Otherwise, it returns "F"
     * _hint_: `possibleMarks` and `earnedMarks` are `int`s.
     * What happens when a smaller integer is divided by a larger integer?
     */

    //declared instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    //constructor used to set the instance variables of the Class
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    //setter - sets the value for EarnedMarks
    public void setEarnedMarks(int earnedMarks) {
        //sets current instance of earnedMarks to the earnedMarks var
        this.earnedMarks = earnedMarks;
    }

    //getters

    public int getEarnedMarks() {
        //returns int value stored for earnedMarks
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }


    public String getLetterGrade(){
        //initialized gradePercentage to the value of getEarnedMarks multipled by 100 divided by getPossibleMarks (Ex.  (7 * 100) / 10 = 70)
        double gradePercentage = getEarnedMarks() * 100 / getPossibleMarks();
        if(gradePercentage >= 90){
            return "A";
        }else if (gradePercentage >= 80 && gradePercentage < 90){
            return "B";
        }else if (gradePercentage >= 70 && gradePercentage < 80){
            return "C";
        }else if (gradePercentage >= 60 && gradePercentage < 70){
            return "D";
            } else{
            return "F";
        }
    }
}



