package com.java.PatternProgramming;
// 5. Pattern Programming
//    *
//    * *
//    * * *
//    * * * *
//    * * *
//    * *
//    *

public class PatternProgramming5 {
    public static void main(String[] args) {
        int i, j, row = 6;

        for(i = 0; i < row ; i++){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        for (i = row; i>=1; i--){
            for (j=1; j<i-1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
