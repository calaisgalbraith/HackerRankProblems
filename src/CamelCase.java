import java.util.Scanner;

public class CamelCase {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String toReturn = "";

        //checks if split
        if(input.charAt(0) == 'S'){

            //checks if method
            if(input.charAt(2) == 'M'){
                input = input.substring(0, input.length()-2); // remove the () at the end

                for (char letter: input.toCharArray()) {

                }
            }

            //checks if class
            else if(input.charAt(2) == 'C'){

            }

            //else is variable
            else{

            }

            System.out.println(toReturn);
        }

        //else combines
        else{

            //checks if method
            if(input.charAt(2) == 'M'){

            }

            //checks if class
            else if(input.charAt(2) == 'C'){

            }

            //else is variable
            else{

            }

            System.out.println(toReturn);
        }

    }
}
