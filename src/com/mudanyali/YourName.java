package com.mudanyali;

import java.util.Scanner;
/**
 * This very basic class just checks if given input
 * contains the variable myName, which happens to hold
 * my name.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-13
 */
public class YourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myName = "Furkan";
        // if uppercase input contains uppercase myName,
        // print "Found your name!", else print "Name not found.."
        if(input.nextLine().toUpperCase().contains(myName.toUpperCase()))
            System.out.println("Found your name!");
        else{
            System.out.println("Name not found..");
        }
        // close input stream to save resources.
        input.close();
    }
}
