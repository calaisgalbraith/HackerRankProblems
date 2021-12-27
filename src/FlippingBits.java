public class FlippingBits {

    public static long flippingBits(long n) {

        String flipped = "";

        //convert long to string binary
        String binary = Long.toBinaryString(n);

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

        System.out.println();
    }
}
