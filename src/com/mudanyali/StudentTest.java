package com.mudanyali;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * This is a testing class for our Student class.
 * It gets student information from the user and
 * fills an arraylist with students. When the user
 * decides they don't want to add students anymore,
 * the program will iterate through arraylist to print
 * all the students the user created.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2021-01-02
 */
public class StudentTest {
    public static void main(String[] args) {
        // show that count is 0 before creating students
        System.out.printf("Students before instantiation: %d%n",
            Student.getCount());
        // We are going to store students in an arraylist.
        ArrayList<Student> students = new ArrayList<>();
        // to get user input
        Scanner input = new Scanner(System.in);
        // We are going to fill these in with user input,
        // then create a student with them.
        int id;
        String firstName;
        String lastName;
        // Get user input
        System.out.println("Do you want to create a student?");
        // If the user answered with "yes"
        if(input.nextLine().toLowerCase().contains("yes")){
            // get in a loop
            while(true){
                // Fill the variables with user input.
                System.out.println("ID of the student?");
                id = input.nextInt();
                // To skip the line-break that comes after the int.
                input.nextLine();
                System.out.println("First name of the student?");
                firstName = input.nextLine();
                System.out.println("Last name of the student?");
                lastName = input.nextLine();
                // Add a new student using the variables to the arraylist.
                students.add(new Student(id, firstName, lastName));
                // This next line will decide if we are gonna break free
                // from the never-ending loop.
                System.out.println("Do you want to add more students?");
                if(!input.nextLine().toLowerCase().contains("yes"))
                    break;
            }     
        }
        // Save the very precious resources.
        input.close();
        // Print the total amount of students.
        System.out.printf("Number of students: %d%n", Student.getCount());
        // Iterate over the arraylist.
        for(int i = 0; i < students.size(); ++i){
            // i+1 is because humans start counting from 1,
            // unlike computers.
            System.out.printf("Student %d: %d - %s %s%n",
                i+1, students.get(i).getId(),
                students.get(i).getFirstName(),
                students.get(i).getLastName());
        }
    }
}
