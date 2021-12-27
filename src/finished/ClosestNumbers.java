package finished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static List<Integer> closestNumbers(List<Integer> arr) {

        //placeholder for list to return
        List<Integer> smallestIntegers = new ArrayList<>();

        //sort array
        Collections.sort(arr);

        //smallest absolute difference placeholder
        int smallest = arr.get(1) - arr.get(0);

        //find the smallest abs difference of the pairs
        for(int i = 0; i < arr.size() - 1; i++){
            if((arr.get(i+1) - arr.get(i)) < smallest){
                smallest = arr.get(i+1) - arr.get(i);
            }
        }

        //if abs diff matches min difference, add to array
        for(int i = 0; i < arr.size() - 1; i++){
            if((arr.get(i+1) - arr.get(i)) == smallest){
                smallestIntegers.add(arr.get(i));
                smallestIntegers.add(arr.get(i+1));
            }
        }

        return smallestIntegers;

    }

    public static void main(String[] args) {
        List<Integer> testing = new ArrayList<>();
        testing.add(-20);
        testing.add(-3916237);
        testing.add(-357920);
        testing.add(-3620601);
        testing.add(7374819);
        testing.add(-7330761);
        testing.add(30);
        testing.add(6246457);
        testing.add(-6461594);
        testing.add(266854);

        System.out.println(closestNumbers(testing));
    }

}
