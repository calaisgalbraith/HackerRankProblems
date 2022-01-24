package finished;

public class FlippingBits {

    //given a list of 32 bit unsigned integers, flip all bits (0 -> 1 && 1 -> 0) and return result as an unsigned integer

    public static long flippingBits(long n) {

        String flipped = "";

        //convert long to string binary
        String binary = Long.toBinaryString(n);

        //working with 32 bit integer, so if length of binary is not 32, add leading 0s until works
        //check length of int and add leading 0s until length is 32
        for(int i = binary.length(); i < 32; i++){
            binary = "0" + binary;
        }

        //go through each number & flip 0 to 1 (and 1 to 0)
        for(char number : binary.toCharArray()){
            if(number == '0'){
                flipped = flipped + "1";
            }
            else{
                flipped = flipped + "0";
            }
        }

        //return flipped string binary to long
        return Long.parseLong(flipped, 2);
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(1));
    }
}
