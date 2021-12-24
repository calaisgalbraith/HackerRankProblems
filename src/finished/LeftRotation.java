package finished;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {


        for(int i = 1; i <= d; i++){
            //get first index of array
            int shiftingNumber = arr.get(0);

            //remove first index
            arr.remove(0);

            //add to end of array
            arr.add(shiftingNumber);

        }

        return arr;

    }

    public static void main(String[] args) {
        List<Integer> testing = new ArrayList<>();
        testing.add(1);
        testing.add(2);
        testing.add(3);
        testing.add(4);
        testing.add(5);

        System.out.println("final " + rotateLeft(4, testing));

    }

}
