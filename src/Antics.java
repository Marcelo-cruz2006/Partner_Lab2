public class Antics {
    //isPalindrome
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

    //isAbecedarian
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
        //check if word is proper length

        if (sentence.length() < 26) {
            return false;
        } else {
            String sentenceLowerCased = sentence.toLowerCase();
            boolean[] alphabet = new boolean[26];
            boolean pangram = true;

            int index = 0;

            for (int i = 0; i < sentenceLowerCased.length(); i++ ) {

                if (sentenceLowerCased.charAt(i) >= 'a' && sentenceLowerCased.charAt(i) <= 'z') {
                    index = sentenceLowerCased.charAt(i) - 'a';
                }
                alphabet[index] = true;
            }

            for (int n=0; n < alphabet.length; n++){
                if (alphabet[n] == false) {
                    pangram = false;
                }

            }
            return pangram;
        }
    }



    //capitalizeFirstLetter method
    public static String capitalizeFirstLetter(String text){
        char letter = text.charAt(0);

        if (Character.isLowerCase(letter)){
            //convert new text
            char letterCapitalized = Character.toUpperCase(letter);

            //String WordCapitalized = letterCapitalized + text.substring(1);

            return letterCapitalized + text.substring(1);
        } else {

            return text + " is already capitalized";
        }
    }
}
