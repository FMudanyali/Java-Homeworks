package com.mudanyali;

import java.util.Scanner;
/**
 * A basic program that reads user input, and then
 * prints out the given inputs that start with letter 'd'
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2021-01-19
 */
public class Final {
    public static void main(String[] args) {
        // Initialize a string array with a size of 10.
        String[] words = new String[10];
        // Initialize Scanner for user input.
        Scanner input = new Scanner(System.in);
        // We want to read user input 10 times.
        System.out.println("Welcome! Please give me 10 words, and I will tell you which ones start with 'd'.");
        for (int i = 0; i < 10; ++i){
            // Populate string array with user input.
            words[i] = input.nextLine();
        }
        // Close Scanner to save resources.
        input.close();
        // Iterate over all the strings in the string array.
        System.out.println("These words you provided start with 'd':");
        for(String word: words){
            // Print word if it starts with 'd'
            if(word.startsWith("d")){
                System.out.println(word);
            }
        }
    }
}
