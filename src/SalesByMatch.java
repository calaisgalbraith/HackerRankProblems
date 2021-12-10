import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {


    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0; //placeholder for pairs

        List<Integer> sockNumbers = new ArrayList<>(); //list to hold number of each sock type

        Collections.sort(ar); //sort array

        int sockNumber = 1;

        for(int i = 0; i < ar.size(); i++) {

            if(ar.get(i).equals(ar.get(i + 1))){
                sockNumber++; //since matching, increase total # of sock type
                continue;
            }
            else{
//                System.out.println("Sock Number: " + sockNumber);
                sockNumbers.add(sockNumber); //add total # of sock type to list
                sockNumber = 1; //reset sockNumber
            }
        }


        for (int number: sockNumbers) {
            if(number % 2 == 0){
                System.out.println("Number: " + number);
                System.out.println("Number divided by 2: " + number / 2);
//                pairs += number / 2; //add number / 2 to give number of pairs
//                System.out.println("Updated Pairs: " + pairs);
            }
            else{
                System.out.println("Number: " + number);
                System.out.println("Number divided by 2 rounded : " + Math.round(number / 2));
//                pairs += Math.round(number / 2) - 1; //add number /2 -1 to offset unmatched sock pairs
//                System.out.println("Updated Pairs: " + pairs);
            }
        }

        return pairs;

    }
}
