import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GamingArray1 {

    //Bob always plays first.
    //In a single move, a player chooses the maximum element in the array.
        //They removes it and all elements to its right.
        // For example, if the starting array [2, 3, 4, 5, 1] then it becomes [2, 3] after removing .
    //The two players alternate turns.
    //The last player who can make a move wins.


    public static String gamingArray(List<Integer> arr) {

        int winner = 0;

        //keep going while size of array is not 0 (game is not over)
        for(int i = 0; i != arr.size();) {

            winner++;

            //find index of largest element
            int indexOfLargest = arr.indexOf(Collections.max(arr));

            //if index is at beginning of array, game is over
            if(indexOfLargest == 0){
                break;
            }

            //else make new array from 0 to largest index
            arr = arr.subList(0, indexOfLargest);
        }

        if(winner % 2 == 0){
            return "ANDY";
        }
        else{
            return "BOB";
        }
    }

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(3);
        test.add(5);
        test.add(4);
        test.add(1);

        System.out.println(gamingArray(test));

    }
}
