package com.mudanyali;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
/**
 * This class demonstrates the usage of Cipher class with file operations.
 * It prompts the user to either decrypt or encrypt, file location, and
 * what key to use respectively.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-21
 */

public class CipherText {
    public static void main(String[] args) {
        System.out.printf("Greetings, what would you like to do?%n"
            +"1. Encrypt a file%n"
            +"2. Decrypt a file%n");
        // Initialize the stuff.
        Scanner input = new Scanner(System.in);
        Cipher encrypter = new Cipher();
        String filePath;
        int key;
        // This is used to determine whether to encrypt or decrypt.
        boolean mode;

        switch(input.nextLine()){
            case "1":
                System.out.println("Which file to encrypt?");
                filePath = input.nextLine();
                System.out.println("What key do you want to use?");
                key = input.nextInt();
                // true is used for encrypt.
                mode = true;
                break;
            case "2":
                System.out.println("Which file to decrypt?");
                filePath = input.nextLine();
                System.out.println("What was the key?");
                key = input.nextInt();
                // false is used for decrypt.
                mode = false;
                break;
            default:
                // Quit if the input was not 1 nor 2.
                System.out.println("Query not understood.");
                input.close();
                return;
        }
        // To save resources.
        input.close();

        // Check if the file exists. Quit if it doesn't.
        File file = new File(filePath);
        if (!file.exists()){
            System.out.println("File not found.");
            return;
        }
        // StringBuilder is a lot more efficient than appending to a regular string.
        StringBuilder inputText = new StringBuilder();
        // The end string to write into file.
        String outputText;
        // Temp value to be used in file reading.
        String fileBuffer;

        // Create a FileReader inside a BufferedReader.
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // While we have lines to read.
            while ((fileBuffer = reader.readLine()) != null) {
                // Append the read file to out inputText variable.
                inputText.append(fileBuffer);
                // Don't forget the line break.
                inputText.append(System.getProperty("line.separator"));
            }
        // Dump the stack if we come across any IO errors.
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Decrypt or encrpyt inputText into outputText.
        if (mode) {
            outputText = encrypter.encrypt(inputText.toString(), key);
        } else {
            outputText = encrypter.decrypt(inputText.toString(), key);
        }
        // Create a FileWriter inside a BufferedWriter. The second argument in FileWriter()
        // determines whether to append or not. false means overwrite.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            // Write the outputText to our file.
            writer.write(outputText);
        // Dump stack if we come across any IO errors.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
