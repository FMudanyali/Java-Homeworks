package com.mudanyali;
/**
 * Very simple student class that stores id, firstname
 * and lastname. Additionally it has a static count so
 * we can see how many students have been created without
 * having to create a student instance.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-01-02
 */
public class Student {
    private static int count = 0; // number of students created
    private int id;
    private String firstName;
    private String lastName;

    // Initialize student, add 1 to static count and
    // output String indicating that constructor was called.
    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // increment count
        System.out.printf("Student constructor: %s %s; count = %d%n",
            firstName, lastName, count);
    }
    // getters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // static method to get static count
    public static int getCount(){
        return count;
    }
}
