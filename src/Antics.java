/**
 * Partner Lab
 *@author Richard Yang (isPalindrome and isAbecederian)
 *@author Marcelo Cruz (isPangram and isCapitalizeLetter)
 */


public class Antics {
    //isPalindrome (richard)
    public static Boolean isPalindrome(String str) {
//        boolean isTrue = true;
//        boolean isFalse = false;
//        int sentence = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char letter1 =  str.charAt(i);
            char letter2 = str.charAt(str.length() - 1 - i);
            if (letter1 != letter2) {
                return false;
            }
        }
        return true;
    }

    //isAbecedarian (Richard)
    public static Boolean isAbecedarian(String str) {
        String sentence = str.toLowerCase();

        for (int i = 0; i < sentence.length()-1; i++) {
            char letter1 = sentence.charAt(i);
            char letter2 = sentence.charAt(i+1);
            if (letter2 < letter1) {
                return false;
            }
        }
        return true;
    }



    //isPangram method (Marcelo Cruz)
    public static boolean isPangram(String sentence){


        if (sentence.length() < 26) {   //check if word is proper length
            return false;
        } else {


            String sentenceLowerCased = sentence.toLowerCase(); //convert sentence to lower case for simplicity


            boolean[] alphabet = new boolean[26];    //array of booleans with length of 26 (alphabet's length)


            boolean pangram = true;  //variable to determine whether sentence is Pangram or not

            int index = 0; //will grab every letter's numerical value in sentence

            for (int i = 0; i < sentenceLowerCased.length(); i++ ) {

                if (sentenceLowerCased.charAt(i) >= 'a' && sentenceLowerCased.charAt(i) <= 'z') {  //checks if letter is between a - z

                    index = sentenceLowerCased.charAt(i) - 'a'; //sets index equal letter's numerical value
                }
                //sets the index of alphabet array to true (the index value is the letter's numerical value from above)
                alphabet[index] = true;
            }


            for (int n=0; n < alphabet.length; n++){    //loop checks if every element in array of boolean is true (meaning there is all 26 letters)

                if (alphabet[n] == false) {
                    pangram = false;
                }

            }
            return pangram;
        }
    }



    //capitalizeFirstLetter method (Marcelo Cruz)
    public static String capitalizeFirstLetter(String text){
        char letter = text.charAt(0);   //grabs first letter
        if (Character.isLowerCase(letter)){


            char letterCapitalized = Character.toUpperCase(letter);  //convert first letter to uppercase


            return letterCapitalized + text.substring(1);   //returns capitalize letter + letters starting from second char of string
        } else {

            return text + " is already capitalized";
        }
    }
}
