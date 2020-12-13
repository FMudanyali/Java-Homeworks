package com.mudanyali;

import java.security.SecureRandom;
/**
 * A game of craps, implemented from Section 6.10
 * in the slides.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-15
 */
public class Craps {
    //Create secure random number generator.
    private static final SecureRandom randomNumbers = new SecureRandom();
    //Enum type with game stasuses.
    private enum Status {CONTINUE, WON, LOST};
    //Constants representing common rolls.
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    //Plays one game of craps.
    public static void main(String[] args){
        int myPoint = 0; //Point if no win or loss on first roll.
        Status gameStatus;

        int sumOfDice = rollDice();
        switch(sumOfDice){
            case SEVEN: //win with 7 on first roll.
            case YO_LEVEN: //win with 11 on first roll.
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //lose with 2 on first roll.
            case TREY: //lose with 3 on first roll.
            case BOX_CARS: //lose with 12 on first roll.
                gameStatus = Status.LOST;
                break;
            default: //Didn't win or lose, so remember point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n",myPoint);
                break;
        }
        while(gameStatus == Status.CONTINUE){ //Didn't win or lose.
            sumOfDice = rollDice(); //Roll again.
            if (sumOfDice == myPoint) gameStatus = Status.WON;
            else if (sumOfDice == SEVEN) gameStatus = Status.LOST;
        }
        //Print game result.
        if (gameStatus == Status.WON) System.out.println("Player won.");
        else System.out.println("Player lost.");
    }

    public static int rollDice(){
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, die1+die2);
        return die1 + die2;
    }
}