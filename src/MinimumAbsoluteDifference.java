import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {



    public static int minimumAbsoluteDifference(List<Integer> arr) {


        //refactored for time constraints
        int minimum = Integer.MAX_VALUE; //placeholder for minimum
        int absoluteDifference = 0; //placeholder for absolute difference

        //sort array
        Collections.sort(arr);

        //loop through each int in list except last one bc no need
        for(int i = 0; i < arr.size() - 1; i++){
            absoluteDifference = Math.abs(arr.get(i) - arr.get(i+1));

            if(absoluteDifference < minimum){
                minimum = absoluteDifference;
            }

        }
        return minimum;


//        int minimum = Integer.MAX_VALUE; //placeholder for minimum
//        int absoluteDifference = 0; //placeholder for absolute difference
//
//        //loop through each int in list except last one (bc no need)
//        for(int i = 0; i < arr.size() - 1 ; i++){
//
//            //loop through each remaining in in array
//            for(int j = i + 1; j < arr.size(); j++){
//                absoluteDifference = Math.abs(arr.get(i) - arr.get(j));
//
//                //if absolute difference is less than minimum
//                if(absoluteDifference < minimum){
//                    minimum = absoluteDifference;
//                }
//            }
//        }
//
//        return minimum;
    }

    public static void main(String[] args) {

    }
}
