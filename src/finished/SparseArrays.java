package finished;

import java.util.*;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> matches = new ArrayList<>(); //placeholder for list to return

        //go through each query
        for (String query: queries) {
            int match = 0;

            //go through each string to check for a match
            for (String string: strings) {

                //check if each string == query
                if(string.equals(query)){
                    match++; //if so, increase match
                }
            }

            matches.add(match); //add total match to list matches
        }
        return matches;
    }
}
