package finished;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> updatedGrades = new ArrayList<>();

        for (int grade: grades) {

            //if grade is less than 40, grade is the same, continue to next one
            if(grade < 38 ){
                updatedGrades.add(grade);
                continue;
            }

            int difference = 0;
            int placeholderGrade = grade;

            //check if divisible by 5, if not keep going until divisible by 5
            while(placeholderGrade % 5 != 0){
                difference++;
                placeholderGrade++;
            }

            //if the diffrence to the next multiple of 5 is less than 3, round grade up
            if(difference < 3){
                updatedGrades.add(placeholderGrade);
            }
            else{ //if not grade stands as is
                updatedGrades.add(grade);
            }
        }

        return updatedGrades;
    }
}
