package finished;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int firstDiagonal = 0; //placeholder first diagonal sum
        int secondDiagonal = 0; //placeholder second diagonal sum

        int arrSize = arr.size(); //get the size of the array

        for(int i = 0; i < arrSize; i++){
            firstDiagonal += arr.get(i).get(i); //add numbers in first diagonal
            secondDiagonal += arr.get(i).get(arrSize - i - 1); //add numbers in second diagonal
        }

        return Math.abs(firstDiagonal - secondDiagonal); //return absolute value of difference in diagonals

    }

}
