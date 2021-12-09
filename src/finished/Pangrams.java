package finished;

import java.util.Locale;

public class Pangrams {

    public static String pangrams(String s) {

        s = s.toLowerCase();

        for(char letter = 'a'; letter <= 'z'; letter++){ //go through alphabet

            if(s.indexOf(letter) < 0){
                return "not pangram";
            }

        }

        return "pangram";

    }

}
