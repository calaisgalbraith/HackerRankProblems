
//find min number of pages needed to turn to reach desired page number

public class DrawingBook {


    public static int pageCount(int n, int p) {
        int pages = 0;

        int holder = (n-p) / 2;

        if(holder % 2 == 0){
            return holder;
        }
        else{
            return (int) (holder - .5);
        }



//        //if desired page is 1 or the end of the book, no need to turn any pages
//        //if n is odd, and p is equal to n -1, also no need to turn any pages
//            //ex 4 & 5 are on the same page so if p = 4 & n=5, then no pages needed
//        if(p == 1 || p == n || ((n % 2 != 0 && p == n - 1))){
//            return 0;
//        }
//
//        //check front of book
//        //while i is less than # page in book, flip page (increase pages) & increase i by 2,
//        for(int i = 1; i < p; i += 2){
//            pages++;
//        }
//
//        //check back of book
//        int backPages = 0;
//        for(int i = n; i >= p ; i -= 2){
//            backPages++;
//        }
//
//        System.out.println("front " + pages);
//        System.out.println("back " + backPages);

    }


    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
    }
}
