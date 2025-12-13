package DataStructure.Arrays;

import java.util.Arrays;

public class Arrays05_Reverse {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60, 70, 80};
        reverse(num);
        System.out.println(Arrays.toString(num));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}
