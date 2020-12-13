package com.mudanyali;

import java.security.SecureRandom;
import java.util.Scanner;
/**
 * Asks a simple multiplication question to the user.
 * Keeps on asking new ones if they get it right.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-15
 */
public class Quiz {
    //Random number generator.
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args) {
        System.out.println("Welcome to a game of quick maths, just answer correctly.");
        //Create answer with 2 random ints.
        int correctAnswer = generateQuestion();
        //Keep in a loop forever.
        while(true){
            //Create scanner for user input.
            Scanner input = new Scanner(System.in);
            //Create a new answer if user gets it right.
            //Else keep asking.
            if (input.nextInt() == correctAnswer){
                System.out.println("Correct!");
                correctAnswer = generateQuestion();
            } else System.out.println("Try again!");
        }
    }

    public static int generateQuestion(){
        //Create 2 random ints in the range of (0..9)
        int number1 = randomNumbers.nextInt(10);
        int number2 = randomNumbers.nextInt(10);
        //Print the question.
        System.out.printf("What is %d x %d?%n", number1, number2);
        //Return the answer to use in our main loop.
        return number1*number2;
    }
}
