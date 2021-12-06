package finished;

import java.util.*;

public class breakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int maxBreak = 0; //placeholder for times broke max record
        int minBreak = 0; //placeholder for times broke min record

        int minimum = scores.get(0); //set inital min points to first game score
        int maximum = scores.get(0);  //set initial max points to first game score

        for (int score: scores) {
            if (score > maximum){
                maxBreak++;
                maximum = score;
            }
            if(score < minimum){
                minBreak++;
                minimum = score;
            }
        }

        List<Integer> breaking = new ArrayList<>(); //List to return
        breaking.add(maxBreak); //add times broke max record
        breaking.add(minBreak); //add times broke min record
        return breaking;
    }

}
