package com.java.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 30;
        intArray[2] = 40;
        intArray[3] = 50;
        intArray[4] = 60;
        intArray[5] = 70;
        intArray[6] = 80;

        for (int j = 0 ; j < intArray.length ; j ++ ) {
            System.out.print(j + " ");
        }
        System.out.println("Done.");
    }
}
