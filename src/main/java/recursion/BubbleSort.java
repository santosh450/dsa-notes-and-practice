package recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 1, 100};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int sortedIndex, int currentIndex){
        if(sortedIndex == 0){
            return;
        }
        if(currentIndex == sortedIndex){
            bubbleSort(arr, sortedIndex-1, 0);
        }
        else {
            if(arr[currentIndex] > arr[currentIndex+1]){
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex+1];
                arr[currentIndex+1] = temp;
            }
            bubbleSort(arr, sortedIndex, currentIndex+1);
        }
    }
}
