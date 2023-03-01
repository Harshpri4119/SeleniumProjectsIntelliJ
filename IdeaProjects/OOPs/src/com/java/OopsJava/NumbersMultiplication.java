package com.java.OopsJava;

import java.util.Scanner;

public class NumbersMultiplication {
    public static void main(String[] args) {
        // Write your code here

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int i;
        for (i = 1; i<= userInput; i++){
            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
