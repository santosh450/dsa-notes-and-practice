/*
Bubble sort is stable sort -> it follows order of same elements
 */


package Algorithem.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 2, 1};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

    }


    static void bubbleSort(int[] arr){
        int temp;
        boolean swapped = false;

        for (int i=0;i<arr.length-1;i++){
            // for each iteration max item will be at end
            for(int j=1; j<arr.length-i;j++){
                // swap if prev element is higer them current element
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // no more execution if any value of i is not swapped
            if(!swapped){
                break;
            }
        }
    }

    static void NotAbubbleSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
