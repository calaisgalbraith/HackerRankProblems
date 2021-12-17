import java.sql.Array;
import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        //placeholders for total number of each types
        List<Integer> typeCounter = Arrays.asList(0, 0, 0, 0, 0);

        //0, 0, 0, 0, 0 --> initial array values
        //0, 1, 2, 3, 4 --> indexes of array
        //1, 2, 3, 4, 5 --> types of birds

        //go through arr array and lo each type occurrence
        for(int type : arr){
            int index = type - 1; //must subtract 1 from type to avoid out of bounds error
            typeCounter.set(index, typeCounter.get(index) + 1);
        }

        int maximum = 0; //placeholder for maximum
        int maxType = 0; //placeholder for lowest type with largest bird

        for(int i = 0; i < 5; i++){

            if(typeCounter.get(i) > maximum){
                maximum = typeCounter.get(i); //reset max to largest type seen value
                maxType = i+1; //set max type to i + 1 (bc types of birds is one more than their index value)
            }
        }

        return maximum;
    }
}
