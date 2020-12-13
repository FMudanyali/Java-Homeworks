package com.mudanyali;

import java.util.ArrayList;
/**
 * Generic ArrayList<E> collection demonstration.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-06
 */
public class ArrayListCollection {
    public static void main(String[] args) {
        // Create ArrayList of doubles.
        ArrayList<Double> studentGrades = new ArrayList<>();
        studentGrades.add(44.22); // Append to the ArrayList.
        studentGrades.add(0, 66.75); // insert 66.75 at index 0.
        // header
        System.out.print(
            "Display list contents with counter-controlled loop:"
        );
        // Display the grades in the list.
        for (int i = 0; i < studentGrades.size(); ++i){
            System.out.printf(" %.2f",studentGrades.get(i));
        }
        // Display grades using enhanced for in the display method.
        display(studentGrades,
            "%nDisplay list contents with enhanced for statement:");
        studentGrades.add(48.56); // Add this to the end of the list.
        studentGrades.add(99.98); // Add this to the end of the list.
        display(studentGrades,
            "List with two new elements: ");
        studentGrades.remove(99.98); // Remove first 99.98.
        display(studentGrades,
            "Remove first instance of 99.98: ");
        studentGrades.remove(1); // Remove item at index 1.
        display(studentGrades,
            "Remove second item in the list: ");
        // Check if a value is in the list.
        System.out.printf("\"44.22\" is%s in the list%n",
            studentGrades.contains(44.22) ? "": " not"); // nice ternary condition
        // Display number of elements in the list.
        System.out.printf("Size: %s%n", studentGrades.size());
        // Display the ArrayList's elements on the console.
    }
    public static void display(ArrayList<Double> items, String header){
        System.out.printf(header); // display header.
        // Display each element in items.
        for(double item : items){
            System.out.printf(" %.2f", item);
        }
        System.out.println();
    }
}
