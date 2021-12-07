package finished;

import java.util.Collections;
import java.util.List;

public class PracticeTestOne {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr); //sort array of integers

        int place = Math.round(arr.size()/2); //get the place where median should be

        return arr.get(place); //return median

    }

}
