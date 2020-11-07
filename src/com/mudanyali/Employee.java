package com.mudanyali;
/** 
 * This is the Employee class we call in our EmployeeTest.
 * It has all the get/set methods along with a function to 
 * increase the salary by 10%.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-07
*/
public class Employee {
	private String firstName, lastName, title;
	private int socialSecurityNumber;
	private double salary;

	// Initializers
	public Employee(){}
	public Employee(String firstName, String lastName, String title, int secNumber, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.socialSecurityNumber = secNumber;
		this.salary = salary;
	}
	// Set-Get Methods
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return this.lastName;
	}

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber){
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getSocialSecurityNumber(){
		return this.socialSecurityNumber;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}

	// Give 10% increase to employee's salary
	public void giveRaise(){
		this.salary = this.salary + this.salary / 10;
	}
}