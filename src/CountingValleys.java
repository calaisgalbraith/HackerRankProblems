public class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int valleys = 0; //placeholder for total valleys
        int incline = 0; //placeholder for incline

        //got through entire String apth
        for (int i = 0; i < path.length(); i++){

            //if first step is D & at sea level --> going into a valley
            if (path.charAt(i) == 'D' && incline == 0){
                valleys++;
            }

            //if step is Down, take away from incline
            if(path.charAt(i) == 'D'){
                incline--;
            }
            else{ //else, step must be up so add to incline
                incline++;
            }
        }

        return valleys;

    }




}
