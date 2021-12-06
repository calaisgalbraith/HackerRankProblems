
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class divisibleSumPairs {
    public static int tester(int n, int k, List<Integer> ar) {

        int total = 0; //placeholder for total

        //run though each number in array except for the last number (n-1)
        for(int i = 0; i < n-1; i++ ){
            //add each remaining number in array to current number
            for(int j = i + 1; j < n; j++){

                //if the sum of two numbers is divisible by k --> add to total
                if((ar.get(i) + ar.get(j)) % k == 0){
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(2);
        System.out.println(tester(6, 3, list)); //should be 5

        List<Integer> list2 = new ArrayList<Integer>();
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(8);
        list.add(4);
        System.out.println(tester(5, 3, list2)); //should be 5
    }
}
