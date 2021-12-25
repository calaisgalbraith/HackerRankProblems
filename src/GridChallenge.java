import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    //return String YES or NO, depending on if each row in List is in alphabetical order

    public static String gridChallenge(List<String> grid) {

        //go through each string in list and sort alphabetically
        for(int i = 0; i < grid.size(); i++){

            //convert string to char arry
            char charArray[] = grid.get(i).toCharArray();

            //sort char array alphabetically
            Arrays.sort(charArray);

            //set string to be alphabetical sorted string
            grid.set(i, charArray.toString());
        }



        return "YES";
    }

    public static void main(String[] args) {

    }
}
