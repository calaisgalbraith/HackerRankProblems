import java.io.*;
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

        //initial max & min values: made to be replaced
        long max = 0;
        long min = 99999999;

        //loop through numbers in array, find the maximum & minimum number in array
        for(int number : arr){
            System.out.println("Number: " + number);

            if(number > max){
                max = number; //set max number
            }

            if(number < min){
                min = number; //set minimum number
            }
        }

        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);

        //loop through all numbers and add
        for(int number: arr){
            minSum += number;
            maxSum += number;
        }

        minSum = minSum - max; //subtract maximum number
        maxSum = maxSum - min; //subtract minimum number

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


