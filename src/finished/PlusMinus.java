package finished;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float positives = 0;
        float negatives = 0;
        float zeros = 0;
        //run through code and get total positives, negatives & zero
        for (int number : arr) {
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else if (number == 0) {
                zeros++;
            }
        }
        //print positives / size
        System.out.println(positives / arr.size());
        //print negatives / size
        System.out.println(negatives / arr.size());
        //print zeros / size
        System.out.println(zeros / arr.size());
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        System.out.println("Expected: .5, .333, .1667");
        plusMinus(list);
    }
}

