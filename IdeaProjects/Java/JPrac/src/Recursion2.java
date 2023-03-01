
/*
  Below we Need to Print back the Numbers from Reverse  in Recursion
  like 10 , 9, 8, 7--- etc
  when it Reaches the 0 , it Needs to Print Done.
 */

public class Recursion2 {
    public static void main(String[] args) {
        decNum(12);
    }
    public static void decNum(int n){  // Calling fun and Passing the int as Param
        if(n == 0){
            System.out.println("Done.");
        }else{
            System.out.println(n);
            n--;                      // we Decrement n each time passing the Statement.
            decNum(n);
        }

    }
}
