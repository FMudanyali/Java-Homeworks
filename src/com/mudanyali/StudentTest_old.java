package com.mudanyali;

import java.util.Scanner;
/**
 * This main function takes properties of student class from the user
 * and then prints them out, along with the student's letter grade.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-25-10
 */
public class StudentTest_old {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student_old student = new Student_old();

        System.out.println("Welcome! Please enter students' name.");
        student.setName(input.nextLine());
        System.out.println("Please input student id.");
        student.setId(input.nextLong());
        input.nextLine(); // Clear the following line-break so we don't skip department.
        System.out.println("Please input student department.");
        student.setDepartment(input.nextLine());
        System.out.println("Please input student grade.");
        student.setGrade(input.nextInt());
        input.close();

        String newline = System.getProperty("line.separator");
        System.out.println(
            "Student Name: "+student.getName()+newline+
            "Student ID: "+student.getId()+newline+
            "Student Department: "+student.getDepartment()+newline+
            "Student Grade: "+student.getGrade()+newline+
            "Student Letter: "+student.getLetterGrade()
        );
    }
}
