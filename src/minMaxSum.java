import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.nio.file.Paths;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Collections;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class minMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        //placeholders for minSum & maxSum
        long minSum = 0;
        long maxSum = 0;

        //sort array
        Collections.sort(arr);

        //loop through all numbers and add
        for(int number: arr){
            minSum += number;
            maxSum += number;
        }

        minSum = minSum - arr.get(arr.size()-1); //subtract maximum number
        maxSum = maxSum - arr.get(0); //subtract minimum number

        System.out.printf("%d %d", minSum, maxSum);

    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        miniMaxSum(list);
        //expected 1575456874 2357937445

    }
}


