package com.mudanyali;

import java.util.Scanner;
/**
 * This simple program gets input from the user 5 times,
 * and compares each input with 60, if it is greater than
 * 60, it prints "You passed the test!", else "You failed the test...".
 * After the 5th input, the program says "Goodbye." and quits.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-24
 */
public class Midterm {
	public static void main(String[] args) {
		// Greet the user.
		System.out.println("Enter your grades to find out if you passed!");
		// Create a new scanner instance.
		Scanner input = new Scanner(System.in);
		// Repeat this 5 times.
		for (int i = 0; i < 5; ++i){
			// Compare user input to 60.
			if (input.nextInt() > 60){
				System.out.println("You passed the test!");
			} else {
				System.out.println("You failed the test...");
			}
		}
		// Close scanner instance to save resources.
		input.close();
		// Say goodbye.
		System.out.println("Goodbye.");
	}
}
