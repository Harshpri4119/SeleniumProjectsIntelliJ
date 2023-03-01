package com.java.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	//  Below we are Creating Int array
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int i = 0; i < array.length ; i ++){
            int largest = 0;
            for (int j = 1; j <= array.length ; j ++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array,largest,i);
        }
        System.out.print(Arrays.toString(array));
    }
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
