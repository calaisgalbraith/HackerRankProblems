import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
// Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.

public class GridChallenge {


    public static String gridChallenge(List<String> words) {

        List<String> sortedWords = new ArrayList<>(); //placeholder for alphabetically sorted rows

        //sort each string in list alphabetically
        for(String word: words){
            char[] placeholder = word.toCharArray(); //make char array from string
            Arrays.sort(placeholder); //sort char array
            sortedWords.add(String.valueOf(placeholder)); //add sorted string to sorted words List
        }

        //go through each letter at a specific index and see if they are sorted alphabetially in columns
        for(int i = 0; i < sortedWords.get(0).length(); i++){

            //get char at index i for first string in list
            char letter = sortedWords.get(0).charAt(i);

            //go through each string in remaining columns and see if letter at index i is greater alphabetically
            for(int j = 1; j < sortedWords.size(); j++){

                //check if next letters is less than letter before it (if not, then not sorted alphabetically)
                if(sortedWords.get(j).charAt(i) < letter){
                    return "NO";
                }

                //reset letter to check against index in next column
                letter = sortedWords.get(j).charAt(i);
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("eabcd");
        test.add("eghij");
        test.add("olkmn");
        test.add("trpqs");
        test.add("xywuv");

        System.out.println(gridChallenge(test));
    }
}
