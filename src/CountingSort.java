import java.util.ArrayList;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {

        //create array to hold values
        List<Integer> trackingNumbers = new ArrayList<Integer>();

        //populate array with 0 and make the same length as arr array
        for(int i = 0; i < arr.size(); i++){
            trackingNumbers.add(0);
        }

        for (int number: arr) {
            trackingNumbers.set(number, trackingNumbers.get(number) + 1); //increase value in array by 1 when number reoccurs
        }

        return trackingNumbers;
    }
}
