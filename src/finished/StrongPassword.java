package finished;

public class StrongPassword {

    // Return the minimum number of characters to make the password strong

    public static int minimumNumber(int n, String password) {
        int characters = 0; //placeholder for char to change

        //boolean values to check if contains uppercase, lowercase, special & digit
        boolean containsNumber = false;
        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsSpecial = false;

        //go through every char in string
        for(char letter : password.toCharArray()){

            //checks if char is digit
            if(Character.isDigit(letter)){
               containsNumber = true;
               continue;
            }

            //checks if char is special char (by default is not a digit)
            if(!Character.isLetter(letter)){
                containsSpecial = true;
                continue;
            }

            //checks if char is uppercase
            if(Character.toUpperCase(letter) == letter){
                containsUpper = true;
                continue;
            }

            //checks if char is lowercase
            if(Character.toLowerCase(letter) == letter){
                containsLower = true;
            }
        }

        //tallies up number of characters
        if(!containsLower){
            characters++;
        }
        if(!containsUpper){
            characters++;
        }
        if(!containsNumber){
            characters++;
        }
        if(!containsSpecial){
            characters++;
        }

        //checks if length is at least 6
        if(password.length() < 6){

            //checks if needed special/upper/digit/lowercase letters sum to make length 6
            if(password.length() + characters < 6){
                //else add however number of chars needed to get length to 6
                characters += 6 - (password.length() + characters);
            }
        }


        return characters;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3, "Ab1"));
    }
}
