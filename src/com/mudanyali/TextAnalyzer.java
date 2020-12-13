package com.mudanyali;

import java.util.HashMap;
/**
 * This class gets the frequency of characters in a given string,
 * and returns the frequency table in a String format.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-12-13
 */
class TextAnalyzer {
    private HashMap<Character, Integer> letterMap = new HashMap<>();
    // Populate the hashmap with the letters we want to count.
    public TextAnalyzer(){
        char alphabet[] =
            {'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // iterate over all the characters inside alphabet and put
        // them in the hashmap.
        for(char letter : alphabet){
            letterMap.put(letter,0);
        }
    }
    // this function counts the occurrence of characters in given string
    // and puts them in the hashmap.
    public void setOccurrence(String input){
        // convert the input to lowercase so we dont have to deal with capital letters.
        input = input.toLowerCase();
        char character;
        // loop over the entire input
        for (int i = 0; i < input.length(); ++i){
            // set the current character
            character = input.charAt(i);
            // if this character is inside the hashmap, which consists of letters
            // of the english alphabet, increment its frequency by 1.
            if (letterMap.get(character) != null)
                letterMap.put(character, letterMap.get(character) + 1);
        }
    }
    // format the hashmap as a nice string
    public String getOccurrence(){
        // the header
        String returnString = " Table of Frequency%n********************%n";
        // this is needed so we can have 2 values in a line.
        boolean linebreak = false;
        // iterate over the entire hashmap
        for (HashMap.Entry<Character, Integer> entry : this.letterMap.entrySet()){
            // "key = value" format
            returnString += entry.getKey()+" = "+entry.getValue();
            // if linebreak is true, put a linebreak and set linebreak to false
            // else put some space and set the linebreak to true.
            if (linebreak) {
                returnString += "%n";
                linebreak = false;
            } else {
                returnString += "          ";
                linebreak = true;
            }
        }
        return returnString;
    }
}