package com.mudanyali;

import java.util.Scanner;
/** 
 * This function initializes 3 empty employees, makes the user fill them,
 * prints out their current information, and then give each employee a 10%
 * salary increase.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-07
*/
public class EmployeeTest {
	public static void main(String[] args) {
		// Create memory block for our employee array.
		Employee[] employees = new Employee[3];
		// Initialize the empty values to the elements.
		for(int i = 0;i < employees.length; ++i){
			employees[i] = new Employee();
		}
		// Set the input scanner.
		Scanner input = new Scanner(System.in);
		// Loop to get every employee's information.
		for(int i = 0;i < employees.length; ++i){
			// Printing employee number as i+1 as humans start counting from 1.
			System.out.printf("Please insert employee No.%d's first name.%n",i+1);
			employees[i].setFirstName(input.nextLine());
			System.out.printf("Please insert employee No.%d's last name.%n",i+1);
			employees[i].setLastName(input.nextLine());
			System.out.printf("Please insert employee No.%d's title.%n",i+1);
			employees[i].setTitle(input.nextLine());
			System.out.printf("Please insert employee No.%d's social security number.%n",i+1);
			employees[i].setSocialSecurityNumber(input.nextInt());
			System.out.printf("Please insert employee No.%d's salary.%n",i+1);
			employees[i].setSalary(input.nextDouble());
			input.nextLine();
		}
		// Loop to display every employee's information.
		for(int i = 0;i < employees.length; ++i){
			System.out.printf("%s %s, %s%nSocial Security Number: %d%nSalary: %.0f%n%n",
			employees[i].getFirstName(),
			employees[i].getLastName(),
			employees[i].getTitle(),
			employees[i].getSocialSecurityNumber(),
			employees[i].getSalary()
			);
		}
		// Loop to give every employee a raise and then print out the new salary.
		for(int i = 0;i < employees.length; ++i){
			employees[i].giveRaise();
			System.out.printf("%s %s New Salary: %.0f%n",
			employees[i].getFirstName(),
			employees[i].getLastName(),
			employees[i].getSalary()
			);
		}
		// Close scanner so there are no leaks.
		input.close();
	}
}
