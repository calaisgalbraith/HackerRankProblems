package finished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {

        //create arrayList to hold values
        List<Integer> trackingNumbers = new ArrayList<>();

        //initialize list
        for(int i = 0; i < 100; i++){
            trackingNumbers.add(0);
        }

        for (int number: arr) {
            trackingNumbers.set(number, trackingNumbers.get(number) + 1); //increase value in array by 1 when number reoccurs
        }

        return trackingNumbers;
    }
}
