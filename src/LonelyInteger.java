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


public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {
        List<Integer> checkedNumbers = new ArrayList<>(); //placeholder for numbers not unique

        //go through each number in the array
        for(int i = 0; i < a.size(); i++){
            int number = a.get(i);

            List <Integer> restOfNumbers = new ArrayList<>(); //reset new array list for numbers after i in array

            //populate array with remainder of numbers after i
            int x = i + 1;
            while(x < a.size()){
                restOfNumbers.add(a.get(x));
                x++;
            }

            //check if number isn't in checked numbers and not in rest of numbers --> unique and return it
            if(!restOfNumbers.contains(number) && !checkedNumbers.contains(number)){
                return number;
            }
            else{
                checkedNumbers.add(number);
            }

        }

        return a.get(a.size() - 1); //if nothing has been returned, last number must be unique
    }

    public static void main(String[] args) {
        List<Integer> tester = new ArrayList<>();

        tester.add(1);
        tester.add(2);
        tester.add(3);
        tester.add(4);
        tester.add(3);
        tester.add(2);
        tester.add(1);

        System.out.println(lonelyInteger(tester));

    }

}
