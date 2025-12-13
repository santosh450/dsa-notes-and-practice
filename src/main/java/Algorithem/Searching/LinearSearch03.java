package Algorithem.Searching;

public class LinearSearch03 {

    public static void main(String[] args) {
        System.out.println(min(new int[][]{{10, 20, 30},
                {40, 50, 60},
                {77, 24, 11, 44, 7}}));
        System.out.println(min(new int[][]{{22, 20, 30},
                {40, 5, 60},
                {40, 5, 60, -5, -85},
                {77, 24, 11, 44, 7}}));
    }

    static int min(int[][] arr) {
        int min = arr[0][0];

        for (int[] row : arr) {
            for (int val : row)
                if (val < min) {
                    min = val;
                }
        }

        return min;
    }
}
