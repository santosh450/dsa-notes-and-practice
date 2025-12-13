package DataStructure.Arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args)
    {
        int[] nums = {10, 54, 88, 9, 11};

        // For loop
        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        //Enhanche for loop
        System.out.println();
        for (int i: nums){
            System.out.print(i+" ");
        }

        //Arrays
        System.out.println();
        System.out.println(Arrays.toString(nums));

    }

}
