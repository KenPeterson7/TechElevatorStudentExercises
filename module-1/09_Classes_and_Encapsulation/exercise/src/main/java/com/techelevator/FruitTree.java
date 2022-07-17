package com.techelevator;

public class FruitTree {

    //set instance variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    //constructor
    public FruitTree(String typeOfFruit, int piecesOfFruitLeft){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;

    }

    //method
    public boolean pickFruit(int numberOfPiecesToRemove){
        if(piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft -= numberOfPiecesToRemove;
                    return true;
        }else{
            return false;
        }
    }

    //getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

}