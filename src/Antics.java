public class Antics {



    //isPangram method
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
