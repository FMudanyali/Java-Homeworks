package com.mudanyali;

import java.util.ArrayList;
/**
 * This class is an implementation of Caesar-cipher.
 * It has methods to encrpyt/decrypt the given string along with the key.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-21
 */
public class Cipher {
    private ArrayList<Character> alphabet = new ArrayList<>();
    private static final int ALPHABET_LENGTH = 26;

    public Cipher(){
        // Initialize an ArrayList consisting of characters from the
        // english alphabet. 
        char alphabetArray[] =
            {'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char letter : alphabetArray){
            alphabet.add(letter);
        }
    }

    public String encrypt(String input, int key){
        // StringBuilder is a lot more efficient than just appending to
        // a regular string. This newInput is what we return.
        StringBuilder newInput = new StringBuilder();
        // to be used in the next loop.
        char character;
        char nextCharacter;
        boolean upperCase;
        // Iterate over the entire input string.
        for (int i = 0; i < input.length(); ++i){
            // Set the character to the i index.
            character = input.charAt(i);
            // If this character is uppercase, make it lowercase and remember
            // that it was uppercase in the beginning.
            if (Character.isUpperCase(character)){
                upperCase = true;
                character = Character.toLowerCase(character);
            // This is to revert it back if it was true before.
            } else {
                upperCase = false;
            }
            // If the current character we are in is a letter from the alphabet.
            if (alphabet.contains(character)){
                // If (character number + key) doesnt exceed the alphabet length.
                if (alphabet.indexOf(character)+key < ALPHABET_LENGTH){
                    // Set nextCharacter to (character number + key)th character in the alphabet.
                    nextCharacter = alphabet.get(alphabet.indexOf(character)+key);
                } else {
                    // Set nextCharacter to (Alphabet length - character number + key)th character
                    // in the alphabet.
                    nextCharacter = alphabet.get(ALPHABET_LENGTH-alphabet.indexOf(character)+key);
                }
            // We don't know this character so let's just keep it as is.
            } else {
                nextCharacter = character;
            }
            // If this character was uppercase, make it uppercase again.
            if (upperCase) {
                nextCharacter = Character.toUpperCase(nextCharacter);
            }
            // Append nextCharacter to our return string.
            newInput.append(nextCharacter);
        }
        // Convert StringBuilder to String.
        return newInput.toString();
    }

    // This is the exact reverse of the encrypt method. Only 3 lines are changed minorly.
    // I will only comment the changed parts. The rest is exactly the same.
    public String decrypt(String input, int key){
        StringBuilder newInput = new StringBuilder();
        char character;
        char nextCharacter;
        boolean upperCase;
        for (int i = 0; i < input.length(); ++i){
            character = input.charAt(i);
            if (Character.isUpperCase(character)){
                upperCase = true;
                character = Character.toLowerCase(character);
            } else {
                upperCase = false;
            }
            if (alphabet.contains(character)){
                // If (character number - key) is not smaller than alphabet length.
                if (alphabet.indexOf(character)-key > ALPHABET_LENGTH){
                    // Set nextCharacter to (alphabet length - character number - key)th character
                    // in the alphabet.
                    nextCharacter = alphabet.get(ALPHABET_LENGTH-alphabet.indexOf(character)-key);
                } else {
                    // Set nextCharacter to (character number - key)th character in the alphabet.
                    nextCharacter = alphabet.get(alphabet.indexOf(character)-key);
                }
            } else {
                nextCharacter = character;
            }
            if (upperCase) {
                nextCharacter = Character.toUpperCase(nextCharacter);
            }
            newInput.append(nextCharacter);
        }
        return newInput.toString();
    }
}
