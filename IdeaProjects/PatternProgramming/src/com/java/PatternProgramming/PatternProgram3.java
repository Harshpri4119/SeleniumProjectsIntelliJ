package com.java.PatternProgramming;
// 3. Pyramid Pattern Program
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *

public class PatternProgram3 {
    public static void main(String[] args) {
        int i, j , row = 6;
        for(i = 0; i<row; i++){
            for(j=row-i; j>1; j--){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
