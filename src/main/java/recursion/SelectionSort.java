package recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 1, 100, 2};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr, int sortedIndex, int currentIndex, int maxIndex){
        if(sortedIndex == 0){
            return;
        }
        if(currentIndex > sortedIndex){
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
            selectionSort(arr, sortedIndex-1, 0, 0);
        }
        else {
            if(arr[currentIndex] > arr[maxIndex]){
                maxIndex = currentIndex;
            }
            selectionSort(arr, sortedIndex, currentIndex+1, maxIndex);
        }
    }
}
