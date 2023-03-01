package com.java.PatternProgramming;
// 4. Diamond Shape Pattern Programming
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

import java.util.Scanner;

public class PatternProgramming4 {
    public static void main(String[] args) {
        int i, j, space = 1;
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
