/*

Infinite array

 */
package Algorithem.Searching;

import java.util.Arrays;

public class BinarySearch08_InfiniteArray {

    public static void main(String[] args) {
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 5));
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 6));
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 7));
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 8));
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 9));
        System.out.println("Output: "+Serchinfinite(new int[]{5, 6, 7, 8, 9, 10}, 10));
        System.out.println("Output: "+Serchinfinite(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, 10));

    }

    static int Serchinfinite(int[] arr, int target){
        System.out.println(Arrays.toString(arr)+" -> "+target);
        int start =0;
        int end =1;
        int temp ;
        while(arr[end]<target){
            temp = end;
            end = end + (end-start+1)*2;
            start = temp+1;
            System.out.println(start+" "+end);
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
