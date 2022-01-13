package finished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTestThree {

    //Between two sets
    //Given two lists, determine all integers that satisfy the following two conditions:
        //elements of first array are all factors of integer being considered
        //integer being considered is a factor of all elements of second array
        //a and b will consist of numbers between/equal to 1-100

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int totalFactors = 0; //placeholder to tally factors

        //go through each number from 1 to 100 to find all possible factors
        for(int i = 1; i <= 100; i++){
            boolean properInteger = true;

            for (Integer integer : b) { //loop through list b and see if i is a factor of each element

                if (integer % i != 0) { //if i isn't a factor, then set proper integer to be false & break out of loop
                    properInteger = false;
                    break;
                }
            }

            if(!properInteger){ //if not proper integer, go to next iteration of i bc no point
                continue;
            }

            for(Integer integer : a){//loop through list a and see if each element is a factor of i

                if (i % integer != 0) { //if a isn't a factor, then set proper integer to be false & break out of loop
                    properInteger = false;
                    break;
                }
            }

           //if both conditions have been met, then increase totalFactors
           if(properInteger){
               totalFactors++;
           }
        }

        return totalFactors;
    }

    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        one.add(2);
        one.add(4);

        two.add(16);
        two.add(32);
        two.add(96);

        System.out.println(getTotalX(one, two));

    }

}
