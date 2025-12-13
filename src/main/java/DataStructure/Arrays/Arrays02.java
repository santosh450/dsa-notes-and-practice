package DataStructure.Arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args){

        //intializing rows are mandatory, not columns
        //2d arrays are no of arrays
        int[][] nums = new int[3][];

        int[][] nums2 = {
                {2, 3, 5},
                {11, 13, 17, 19},
                {23}
        };

        for(int row=0; row<nums2.length; row++) {
            for(int col=0; col<nums2[row].length; col++) {
                System.out.print(nums2[row][col]+" ");
            }
            System.out.println();
        }

        for(int row=0; row<nums2.length; row++) {
            System.out.println(Arrays.toString(nums2[row]));
        }

        for(int[] row: nums2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
