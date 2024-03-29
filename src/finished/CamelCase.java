package finished;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {

        //read input
        Scanner sc = new Scanner(System.in);

        //ArrayList to hold inputs
        List<String> inputs = new ArrayList<>();

        //placeholder for scanner input
        String scannerInput = "";

        boolean continueReading = true;

        //keep reading scanner input until no more lines
        while(continueReading){
            try{
                scannerInput = sc.nextLine();
                if(scannerInput.equals("C;C;mirror")){
                    continueReading = false;
                }
                inputs.add(scannerInput);
            }
            catch (NoSuchElementException e){
                continueReading = false;
            }
        }

        //loop through each string in array
        for (String input:inputs) {

            String toReturn = "";

            //checks if split
            if(input.charAt(0) == 'S') {

                //checks if method
                if (input.charAt(2) == 'M') {
                    input = input.replaceFirst("S;M;", ""); //remove first four char
                    input = input.substring(0, input.length() - 2); //remove ()
                }

                //checks if class
                else if (input.charAt(2) == 'C') {
                    input = input.replaceFirst("S;C;", ""); //remove first four char
                    input = Character.toLowerCase(input.charAt(0)) + input.substring(1); //make first letter lowercase
                }

                //else is variable
                else {
                    input = input.replaceFirst("S;V;", ""); //remove first four char
                }

                //loop through each letter in string
                for (char letter : input.toCharArray()) {
                    //if uppercase, make lowercase
                    if (Character.isUpperCase(letter)) {
                        toReturn = toReturn + " " + Character.toLowerCase(letter);
                    } else {
                        toReturn = toReturn + letter;
                    }
                }
            }

            //else is combine
            else{

                //checks if method
                if (input.charAt(2) == 'M') {
                    input = input.replaceFirst("C;M;", ""); //remove first four char
                    input = input + "()"; //add closing brackets
                }

                //checks if class
                else if (input.charAt(2) == 'C') {
                    input = input.replaceFirst("C;C;", ""); //remove first four char
                    input = Character.toUpperCase(input.charAt(0)) + input.substring(1); //make first letter upperCase
                }

                //else is variable
                else {
                    input = input.replaceFirst("C;V;", ""); //remove first four char
                }

                boolean makeNextCapital = false;

                 //loop through each letter in string
                for (char letter : input.toCharArray()) {
                    //if char is a space, remove and make next one uppercase
                    if (letter == ' ') {
                        makeNextCapital = true;
                    }
                    //check if make next letter capital
                    else if (makeNextCapital){
                        toReturn = toReturn + Character.toUpperCase(letter);
                        makeNextCapital = false; //reset makeNextCapital
                    }
                    //else just add next letter as is
                    else{
                        toReturn = toReturn + letter;
                    }
                }
            }

            System.out.println(toReturn);
        }

    }
}
