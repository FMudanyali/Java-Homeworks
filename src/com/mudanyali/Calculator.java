package com.mudanyali;

import java.util.Scanner;

/**
 * A program that gets 2 numbers from the user
 * and prints out addition, subtraction, multiplacion
 * and division.
 * Furkan MUDANYALI
 * 20181701088
 */
public class Calculator {
	public static void main(String[] args){
		// Get the inputs from user, i have made it double so it is more precise.
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your first number.");
		double num1 = input.nextDouble();
		System.out.println("Please input your second number.");
		double num2 = input.nextDouble();
		// Close the input stream so there is no leak.
		input.close();
		// Used a common format string to prevent copy-pasting
		// the same thing over and over.
		// It also formats the double to 2 decimal places.
		String formatText = "%.2f %s %.2f = %.2f%n";
		// Print the results.
		System.out.printf(formatText, num1, "+", num2, num1 + num2);
		System.out.printf(formatText, num1, "-", num2, num1 - num2);
		System.out.printf(formatText, num1, "*", num2, num1 * num2);
		System.out.printf(formatText, num1, "/", num2, num1 / num2);
	}
}