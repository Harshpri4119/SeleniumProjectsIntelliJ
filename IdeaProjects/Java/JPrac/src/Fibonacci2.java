/**
 * Below we are Doing the Fibonacci using the Recursion
 */

public class Fibonacci2 {
    static int a = 0;
    static int b = 1;
    static int c;
    public static void main(String[] args) {
        int count = 10;
        System.out.print(a + " " + b);  //printing 0 and 1
        fibonacci(count - 2);     //n-2 because 2 numbers are already printed

    }
    static void fibonacci(int count){

        if (count > 0){
            c = a+b;
            a=b;
            b=c;
            System.out.print(" " + c);
            count--;                 // we Decrement count each time passing the Statement.
            fibonacci(count);
        }
    }
}
