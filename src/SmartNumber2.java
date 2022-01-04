import java.util.Scanner;

public class SmartNumber2 {

    //debug given code to work
    //A number is called a smart number if it has an odd number of factors.
    // Given some numbers, find whether they are smart numbers or not.

    //Note: You can modify only one line in the given code and you cannot
    // add or remove any new lines.

    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);

//        if(num / val == 1)
        if(num / (double) val == val)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
