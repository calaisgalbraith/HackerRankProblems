package finished;

public class MarsExploration {

    public static int marsExploration(String s) {
        int lettersChanged = 0; //placeholder for total lettersChanged
        int counter = 1;

        for(int i = 0; i < s.length(); i++){

            //checks if letter is S
            if(counter == 1){
                if (s.charAt(i) != 'S'){
                    lettersChanged++;
                }
                counter++;
            }

            //checks if letter is O
            else if(counter == 2){
                if(s.charAt(i) != 'O'){
                    lettersChanged++;
                }
                counter++;
            }

            //checks if letter is S
            else if(counter == 3){
                if (s.charAt(i) != 'S'){
                    lettersChanged++;
                }
                counter = 1; //reset counter to 1
            }


        }

        return lettersChanged;
    }


}
