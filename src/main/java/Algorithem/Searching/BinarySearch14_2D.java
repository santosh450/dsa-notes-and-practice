/*

2D matrix - both rows and columns are sorted


 */
package Algorithem.Searching;

import java.util.Arrays;

public class BinarySearch14_2D {

    public static void main(String[] args) {

        int[][] arr = {
                {17, 18, 19, 21, 24, 30},
                {19, 20, 21, 23, 26, 40},
                {23, 25, 31, 32, 36, 50},
                {27, 29, 33, 35, 40, 60}
        };

        System.out.println("Output1: "+ Arrays.toString(getSolution(new int[][]{{17, 18, 19, 21, 24, 30},
                                                                                {19, 20, 21, 23, 26, 40},
                                                                                {23, 25, 31, 32, 36, 50},
                                                                                {27, 29, 33, 35, 40, 60}}, 32)));

        System.out.println("Output2: "+ Arrays.toString(getSolution2(arr, 32)));
    }

    //Considering boundary is arr[0][last]
    static int[] getSolution(int[][] arr, int target){
        int rowBoundary = 0;
        int columnBoundary = arr[0].length-1;
        while (columnBoundary>=0 && rowBoundary<=arr.length-1){
            if(arr[rowBoundary][columnBoundary]==target){
                return new int[]{rowBoundary, columnBoundary};
            }
            else if(arr[rowBoundary][columnBoundary]>target){
                columnBoundary--;
            }
            else{
                rowBoundary++;
            }
        }
        return new int[]{-1, -1};
    }

    //Considering boundary is arr[last][0]
    static int[] getSolution2(int[][] arr, int target){
        int rowBoundary = arr.length-1;
        int columnBoundary = 0;
        while (columnBoundary<arr[0].length && rowBoundary>=0){
            if(arr[rowBoundary][columnBoundary]==target){
                return new int[]{rowBoundary, columnBoundary};
            }
            else if(arr[rowBoundary][columnBoundary]>target){
                rowBoundary--;
            }
            else{
                columnBoundary++;
            }
        }
        return new int[]{-1, -1};
    }
}


