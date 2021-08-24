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
        //add all except min
        long minSum = 0;
        long maxSum = 0;

        long max = 0;
        long min = 99999999;


        for(int number : arr){
            if(number > max){
                max = number;
            }
        }
        for(int number : arr){
            if(number < min){
                min = number;
            }
        }

        for(int number: arr){
            //add all except max
            if(number != max){
                minSum += number;
            }
            //add all except min
            if(number != min){
                maxSum += number;
            }
        }

        System.out.printf("%d %d", minSum, maxSum);

    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(140537896);
        list.add(243908675);
        list.add(670291834);
        list.add(923018467);
        list.add(52071846);
        miniMaxSum(list);
        //expected 1575456874 2357937445

    }
}


