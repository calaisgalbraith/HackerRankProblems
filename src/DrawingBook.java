
//find min number of pages needed to turn to reach desired page number

public class DrawingBook {


    public static int pageCount(int n, int p) {

        int pageCountFront = n / 2;
        int targetPageCountFront = p / 2;
        int targetPageCountBack = pageCountFront - targetPageCountFront;

        return Math.min(targetPageCountFront, targetPageCountBack);

    }


    public static void main(String[] args) {
        System.out.println(pageCount(7, 4));
    }
}
