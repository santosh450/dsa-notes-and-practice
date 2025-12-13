//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 */
package Algorithem.Searching;

import java.util.Arrays;

public class BinarySearch07_Leet34 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 5, 6, 6, 7, 7}, 5)));  //Ans: 0, 1
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 5, 6, 6, 7, 7}, 6)));  //Ans: 2, 3
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 5, 6, 6, 6, 6}, 6)));  //Ans: 2, 3
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 6, 6, 7, 7, 8}, 6)));  //Ans: 1, 2
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 5, 6, 6, 7, 7}, 7)));  //Ans: 4, 5
        System.out.println(Arrays.toString(BinarySearch(new int[]{5, 5, 6, 6, 7, 7}, 8)));  //Ans: -1, -1

    }

    static int[] BinarySearch(int[] arr, int target) {

        int[] ans = {-1, -1};
        ans[0] =search(arr, target, true);
        if(ans[0]!=-1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(findStartIndex)
                    end = mid -1;
                else
                    start = mid +1;
            }
        }
        return ans;
    }

}
