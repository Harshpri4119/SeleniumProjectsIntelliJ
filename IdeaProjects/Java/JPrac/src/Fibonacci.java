/**
 *  Below Fibonacci we are doing with out Recursion
 *
 *
 */

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int count = 20;

        System.out.print(a + " " + b); //printing 0 and 1    0 + " " + 1 = 1 in the Third Place

        for(int i = 2; i<count; i++){ //loop starts from 2 because 0 and 1 are already printed
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
