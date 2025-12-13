package recursion;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int i, int[] arr){
        int n = arr.length;
        if(i >= n/2){
            return;
        }

        swap(i, n-1-i, arr);
        reverse(i+1, arr);

    }

    static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 5, 10};
        reverse(0, arr);
        System.out.println(Arrays.toString(arr));
    }
}
