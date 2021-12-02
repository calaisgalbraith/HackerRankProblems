
package finished;

import java.util.ArrayList;
import java.util.List;

public class PlusMinusExtra {

    public void main(String[] args){
        List<Integer> test = new ArrayList<>();
        test.add(-4);
        test.add(3);
        test.add(-9);
        test.add(0);
        test.add(4);
        test.add(1);
        plusMinus(test);
    }
    public static void plusMinus(List<Integer> arr) {

        float positives = 0; //stores total # of positives
        float negatives = 0; //stores total # of negatives
        float zeros = 0; //stores total # of zeros
        float length = arr.size();

        for(int number : arr){ //go through each Integer in the List
            if(number < 0){
                positives++; //add to total positives
            }
            else if (number > 0){
                negatives++; //add to total negatives
            }
            else{
                zeros++; //adds to total zeros
            }
        }

        float positiveRatio = positives / length;
        float negativeRatio = negatives / length;
        float zeroRatio = zeros / length;

        System.out.printf("%.6f", positiveRatio);
        System.out.printf("%.6f", negativeRatio);
        System.out.printf("%.6f", zeroRatio);
    }


}
