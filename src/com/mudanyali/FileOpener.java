package com.mudanyali;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
/**
 * This class reads a file called "test.txt", creates it if it
 * doesn't exist, prints it out in the terminal, then asks the
 * user for input to append to the file. User can quit by typing "!"
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-21
 */
public class FileOpener {
    public static void main(String[] args) {
        // Initialize the file handle.
        File file = new File("test.txt");
        // Try creating a new file if it doesn't exist. If we get any sort
        // of IO errors like permissions, print the stack trace.
        try {
            // This returns true if it creates a file.
            if (file.createNewFile())
                System.out.println("Created file \"test.txt\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // This is sort of a temp variable to keep the next line.
        String line;
        // Read the file in a BufferedReader because apparently that is the norm.
        // It looks complicated but we just create a new FileReader inside a new
        // BufferedReader.
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Print the lines as long as there are lines to read.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        // print stack trace if we get any sort of IO errors.
        } catch (IOException e) {
            e.printStackTrace();
        }
        // This is literally the same with BufferedReader with one difference,
        // the second argument in FileWriter() decides whether to append or not.
        // false means overwrite, true means append.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            Scanner scanner = new Scanner(System.in);
            // Temp variable to keep the user input.
            String input;
            // Append the incoming lines along with a line break, as long as
            // the user doesn't input "!"
            while (!(input = scanner.nextLine()).equals("!")){
                writer.write(input);
                writer.newLine();
            }
            // Close the scanner.
            scanner.close();
        // Any sort of IOException? You are here to print the stack trace.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}