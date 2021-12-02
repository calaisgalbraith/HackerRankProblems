
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
        int total = 0;
        //run through array
        for(int i = 0; i < n-1; i++ )
            //run through sum for remainder of array
            for(int j = i + 1; j < n; j++){
                if((ar.get(i) + ar.get(j)) % k == 0){
                    total++;
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

//public static int tester(int n, int k, List<Integer> ar) {
//        // Write your code here
//        int total = 0;
//
//        for(int num : ar) {
//            System.out.println("First numb: " + num + "\n");
//
//            for(int i = num; i < ar.size() - 1; i++){
//                int nextNumb = ar.get(i);
//                if((num + nextNumb) % k == 0){
//                    System.out.printf("%d + %d = " + (num + nextNumb) + "\n", num, nextNumb);
//                    total++;
//                    System.out.println(total + "\n");
//                }
//            }
//        }
//        return total;
//    }