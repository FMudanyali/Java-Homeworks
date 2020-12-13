package com.mudanyali;

import java.util.Scanner;

public class LetterGrades {
	public static void main(String[] args) {
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;
		Scanner input = new Scanner(System.in);

		System.out.printf("%s%n%s%n %s%n %s%n",
		"Enter the integer grades in the range 0-100.",
		"Type the end-of-file indicator to terminate input:",
		"On UNIX/Linux/macOS type <Ctrl> d then press Enter",
		"On Windows type <Ctrl> z then press Enter."
		);
		// Loop until user enters the end-of-file indicator
		while(input.hasNext()){
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
			/* This is commented out because the next if-else block does
			the same thing. NOTE: This is what the homework asks from me,
			otherwise I would never do such thing.

			switch(grade / 10){
				case 9:
				case 10:
					++aCount;
					break;
				case 8:
					++bCount;
					break;
				case 7:
					++cCount;
					break;
				case 6:
					++dCount;
					break;
				default:
					++fCount;
					break;
			}
			*/
			if(grade > 90)
				++aCount;
			else if(grade > 80)
				++bCount;
			else if(grade > 70)
				++cCount;
			else if(grade > 60)
				++dCount;
			else
				++fCount;
		}
		System.out.printf("%nGrade Report:%n");
		if(gradeCounter != 0){
			double average = (double) total / gradeCounter;

			System.out.printf("Total of the %d grades entered is %d%n",
			gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
			"Number of students who received each grade:",
			"A: ", aCount,
			"B: ", bCount,
			"C: ", cCount,
			"D: ", dCount,
			"F: ", fCount
			);
		}
		else {
			System.out.println("No grades were entered.");
		}
		input.close();
	}
}
