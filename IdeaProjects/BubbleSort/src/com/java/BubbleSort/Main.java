package com.java.BubbleSort;


/**
 *  Below we are Implementing the Bubble Sort Algorithm by swapping the elements in the Array.
 */
public class Main {

    public static void main(String[] args) {
        // Below we are Creating the Int Array
        int[] intArray = {41, 19, 6, 9, 2, 34, 41, 47};
        int lastUnSortedIndex;
        int i;

        for(lastUnSortedIndex = intArray.length -1; lastUnSortedIndex > 0; lastUnSortedIndex--){
            for (i = 0; i < lastUnSortedIndex; i++){
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray,i,i+1);
                }
            }
        }

        for(i = 0; i < intArray.length ; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    // below we Created the Swap Method.
    public static void swap(int[] array, int i, int j){
        //Because if i == j, there's nothing to swap,
        // so there's no need to continue executing the method.
        // I'm using the return statement to exit from the method at that point.
        if(i==j){
            return;
        }
        // if i is not equal to j then we need to swap the elements in the Array
        // below we are Swapping the Values of the i and j.

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
