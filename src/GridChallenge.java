import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    //return String YES or NO, depending on if each row in List is in alphabetical order

    public static String gridChallenge(List<String> grid) {

        //go through each string in list and sort alphabetically
        for(String word : grid){
            char[] placeholder = word.toCharArray(); //make char array from string
            Arrays.sort(placeholder); //sort char array
            word = placeholder.toString(); //set word to be sorted char array

        }

        //get length of words
        int longest = grid.get(0).length();

        //go through each letter of a word
        for(int i = 0; i < longest; i++){

            //get char at index i for first string in list
            char letter = grid.get(0).charAt(i);

            //go through each string in list and see if letter at index i is sorted for each
            for(int j = 1; j < grid.size(); j++){

                //checks that next letter in column is not less than letter before it (if so, not alpha)
                if(grid.get(j).charAt(i) < letter ){
                    return "NO";
                }

                //set letter to be next letter
                letter = grid.get(j).charAt(i);
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("eabcd");
        test.add("fghij");
        test.add("olkmn");
        test.add("trpqs");
        test.add("xywuv");

        System.out.println(gridChallenge(test));
    }
}
