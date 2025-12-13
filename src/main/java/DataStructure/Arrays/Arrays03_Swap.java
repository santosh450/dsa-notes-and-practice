package DataStructure.Arrays;

import java.util.Arrays;

public class Arrays03_Swap {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60, 70};
        swap(num, 1, 3);
        System.out.println(Arrays.toString(num));

        int[] num2 = {5, 15, 25, 35, 40, 50, 60, 70};
        int start = 0;
        int end = num2.length - 1;
        while (start < end) {
            swap(num2, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(num2));
    }

    public static void swap(int[] arr, int i, int j) {
        if (i <= j && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
