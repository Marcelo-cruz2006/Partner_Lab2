/**
 * Partner Lab 2
 * This program features four capabilities: Palindrome checking, Abecedarian checking, Pangram checking, and capitalizing the first letter of a sentence.
 * The program's source code is open and free from any backdoors, malicious software, or Trojan viruses; all input is processed locally.
 * @author Marcelo-cruz & Richard Young
 * @isPangram takes a string and returns true if it contains all 26 letters of the alphabet
 * @capitalizeFirstLetter takes a string and returns the same string with its first letter (only) capitalized
 * @isAbecedarian takes a string and returns true if it is a abecedarian.
 * @isPalindrome takes a string and returns true if it is a palindrome. 【A word is said to be a “palindrome” if it reads the same backward as forward】
 * date 18/Mar
 */

// isPangram method (made by Marcelo Cruz)
public class Antics {
    public static boolean isPangram(String sentence) {
        if (sentence.length() < 26) {//check if word is proper length
            return false;
        }
        String sentenceLowerCased = sentence.toLowerCase(); //convert sentence to lower case for simplicity
        boolean[] alphabet = new boolean[26];//array of booleans with length of 26 (alphabet's length)
        int index = 0; //will grab every letter's numerical value in sentence

        for (int i = 0; i < sentenceLowerCased.length(); i++) {
            char currentChar = sentenceLowerCased.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {//checks if letter is between a - z
                index = currentChar - 'a';//sets index equal letter's numerical value
                alphabet[index] = true;//sets the index of alphabet array to true (the index value is the letter's numerical value from above)
            }
        }
        for (boolean letterExists : alphabet) {//loop checks if every element in array of boolean is true (meaning there is all 26 letters)
            if (!letterExists) {
                return false;
            }
        }
        return true;
    }

    //isCapitalizeFirstLetter method (made by Marcelo Cruz)
    public static String capitalizeFirstLetter(String text) {
        char letter = text.charAt(0);   //grabs first letter
        if (Character.isLowerCase(letter)){
            char letterCapitalized = Character.toUpperCase(letter);  //convert first letter to uppercase
            return letterCapitalized + text.substring(1);   //returns capitalize letter + letters starting from second char of string
        } else {
            return text + " is already capitalized";

        }
    }

    // isisPalindrome method (made by Richard Young)
    public static boolean isPalindrome(String str) {//Create a boolean class isPalindrome and pass it a String class parameter str
        int length = str.length();//Store the data received from str.length into an integer variable named length
        for (int i = 0; i < length / 2; i++) {//Create a loop to iterate over the length of a string
            if (str.charAt(i) != str.charAt(length - 1 - i)) {//The judgment condition is: if the first and last digits of the string do not want to be equal
                return false;//judged to be false
            }
        }
        return true;//judged to be ture
    }

    // isAbecedarian method (made by Richard Young)
    public static boolean isAbecedarian(String str) {//Create a boolean class isPalindrome and pass it a String class parameter str
        str = str.toLowerCase();//Call the lowercase conversion API and store the data in str
        for (int i = 0; i < str.length() - 1; i++) {//Create a loop to traverse in each word
            if (str.charAt(i) > str.charAt(i + 1)) {//Determines whether the ASCII value of a character is increasing
                return false;//judged to be false
            }
        }
        return true;//judged to be ture
    }
}