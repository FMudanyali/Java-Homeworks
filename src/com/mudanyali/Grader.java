package com.mudanyali;
/**
 * This class gets any amount of grades from the user,
 * then prints back the average grade and letter grade.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-01
 */
import java.util.Scanner;

public class Grader {
	int grade = 0;
	int gradeTotal = 0;
	int gradeCount = 0;
	double average = 0;
	char letter;

	public void start(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a grade or -1 to quit: ");
		this.grade = input.nextInt();
		while (this.grade != -1){
			this.gradeTotal += this.grade;
			this.gradeCount += 1;

			System.out.println("Please enter a grade or -1 to quit: ");
			this.grade = input.nextInt();
		}
		input.close();

		calculateAverage();
		calculateLetter();
		printResult();
	}

	private void calculateAverage(){
		this.average = (double)this.gradeTotal / this.gradeCount;
	}

	private void calculateLetter(){
		if (this.average > 90) this.letter = 'A';
		else if (this.average > 80) this.letter = 'B';
		else if (this.average > 70) this.letter = 'C';
		else if (this.average > 60) this.letter = 'D';
		else this.letter = 'F';
	}

	private void printResult(){
		System.out.printf("Amount of grades entered: %d%n", this.gradeCount);
		System.out.printf("The grade total: %d%n", this.gradeTotal);
		System.out.printf("The average: %.0f%n", this.average);
		System.out.printf("The letter grade: %c%n", this.letter);
	}
}
