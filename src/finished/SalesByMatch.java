package finished;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {

    public static void main(String[] args) {

        List<Integer> socks = new ArrayList<>();
        socks.add(10);
        socks.add(20);
        socks.add(20);
        socks.add(10);
        socks.add(10);
        socks.add(30);
        socks.add(50);
        socks.add(10);
        socks.add(20);

        System.out.println(sockMerchant(10,socks));
    }


    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0; //placeholder for pairs

        Collections.sort(ar); //sort array numerically

        int sockNumber = 1; //number to keep track of how many of each type of sock
        int sockType = ar.get(0); //set sock type to first sock in array

        //loop through each sock in array
        for(int i = 1; i < ar.size(); i++) {

            //if current sock == previous sock type
            if(ar.get(i) == sockType){
                sockNumber++;

                //if sockNumber == 2 --> a pair
                if(sockNumber % 2 == 0){
                    pairs++; //increase pairs
                    sockNumber = 0; //reset sockNumber
                }

            }

            //if current sock != previous sock type
            else{
                //reset sockType
                sockType = ar.get(i);

                //reset sockNumber
                sockNumber = 1;
            }
        }

        return pairs;
    }
}
