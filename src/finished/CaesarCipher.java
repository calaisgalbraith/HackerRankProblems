package finished;

public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }

    public static String caesarCipher(String s, int k) {

        //create encoded string
        StringBuilder encoded = new StringBuilder();

        //if k is greater than 26, subtract 26 till get numb
        while(k > 26){
            k = k - 26;
        }

        //loop through each char in string
        for(int i = 0; i < s.length(); i++){

            char letter = s.charAt(i);

            //check if char is a lowercase letter or not
            if('a' <= letter && letter <= 'z'){
                //change char to shifted char
                letter = (char) (letter + k);

                //check if greater than z, if so subtract 26
                if(letter > 'z'){
                    letter = (char) (letter - 26);
                }
                //add to string
                encoded.append(letter);
            }

            //check if char is an uppercase letter or not
            else if('A' <= letter && letter <= 'Z'){
                //change char to shifted char
                letter = (char) (letter + k);

                //check if greater than z, if so subtract 26
                if(letter > 'Z'){
                    letter = (char) (letter - 26);
                }
                //add to string
                encoded.append(letter);
            }

            //if not a letter --> add to string
            else{
                encoded.append(letter);
            }
        }

        return encoded.toString();
    }

}
