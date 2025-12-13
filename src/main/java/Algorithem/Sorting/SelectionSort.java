 /*

 */


package Algorithem.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 2, 1};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

    }


    static void selectionSort(int[] arr){

        for (int i=0;i<arr.length;i++){
            // find max index and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i])
              max = i;
        }
        return max;
    }

    static void swap(int[] arr, int max, int index){
        int temp = arr[max];
        arr[max] = arr[index];
        arr[index] = temp;
    }


}
