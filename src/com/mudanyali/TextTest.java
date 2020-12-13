package com.mudanyali;

import java.util.Scanner;
/**
 * This class is a test class for TextAnalyzer.
 * It asks the user for an input and then counts the letters
 * of the given input.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-13
 */
public class TextTest {
    public static void main(String[] args) {
        TextAnalyzer test = new TextAnalyzer();
        Scanner input = new Scanner(System.in);
        // Ask the user for input and put it in
        // TextAnalyzer.setOccurrence
        System.out.println("Please input your text so i can count the frequency of letters.");
        test.setOccurrence(input.nextLine());
        // Close the input stream to save resources.
        input.close();
        // Print the returned formatted string.
        System.out.printf(test.getOccurrence());
    }
}
