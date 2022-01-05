import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxPerimeterTriangle {

    //given array of integers, find 3 that form a non-degenerate triangle w/ max perimeter
    //return array of lengths of sides as 3 integers in non-decresing order

    //if several triangles have max perimeter
    //chose one with longest maximum side
    //if more than one has max size, choose from on with longest min side
    //if more than one has that max min side, return any of them
    //if no non degenerate triangle exists return -1

    //-----------
    //how to tell if will form triangle
    //A + B > C
    //B + C > A
    //A + C > B

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

        List<Integer> sides = new ArrayList<>(); //list of sides to return
        sides.add(0);
        sides.add(0);
        sides.add(0);

        int maxPerimeter = 0; //placeholder for max perimeter

        //loop through sticks and try out each combo to see if viable for triangle (loop until size - 2, or else will throw out of bounds error)
        for(int i = 0; i < sticks.size() - 1; i++){

            //loop through each combo for first number to add
            for (int j = i + 1; j < sticks.size() - 1; j++){

                //loop through each combo for second number to add
                for(int k = j + 1; k < sticks.size(); k++){

                    int a = sticks.get(i);
                    int b = sticks.get(j);
                    int c = sticks.get(k);

                    //call method to check if triangle
                    if((a + b > c) && (b + c > a) && (a + c > b)){

                        //check to see if a + b + c is new max
                        if(a + b + c > maxPerimeter){
                            //if yes, set sides values to be current a, b, c
                            sides.set(0, a);
                            sides.set(1, b);
                            sides.set(2, c);
                        }

                        //if multiple cases of maximum perimeter
                        if(a + b + c == maxPerimeter){
                            List<Integer> compareSides = Arrays.asList(a, b, c); //create list to hold a, b, c

                            Collections.sort(compareSides); //sort compareSides
                            Collections.sort(sides); //sort sides

                            //if a, b, c has larger max size --> set sides to be a, b, c
                            if(sides.get(2) < compareSides.get(2)){
                                sides.set(0, a);
                                sides.set(1, b);
                                sides.set(2, c);
                            }

                            //if both have equal max sides, see which has larger min size
                            if(sides.get(2) == compareSides.get(2)){

                                //if a, b, c has larger min size --> set sides to be a, b, c
                                if(sides.get(0) < compareSides.get(0)){
                                    sides.set(0, a);
                                    sides.set(1, b);
                                    sides.set(2, c);
                                }
                            }
                        }
                    }
                }
            }
        }

        //check if a valid triangle has been formed (index 0 if sides isn't 0)
        if(sides.get(0) == 0){
            sides.remove(2);
            sides.remove(1);
            sides.set(0, -1);
        }

        //sort sides
        Collections.sort(sides);

        return sides;
    }

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>(); //3, 4, 5
        test.add(3);
        test.add(9);
        test.add(2);
        test.add(15);
        test.add(3);


        System.out.println(maximumPerimeterTriangle(test).toString());

    }
}
