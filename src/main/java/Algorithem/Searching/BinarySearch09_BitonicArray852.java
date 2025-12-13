/*

https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

Mountain array/ Bitonic

 */
package Algorithem.Searching;

public class BinarySearch09_BitonicArray852 {

    public static void main(String[] args) {
        System.out.println("Output: "+BinarySearch(new int[]{5, 6, 7, 8, 6, 5}));  //ans 3
        System.out.println("Output: "+BinarySearch(new int[]{5, 6, 7, 3, 2, 1}));  //ans 2
        System.out.println("Output: "+BinarySearch(new int[]{5, 6, 7, 8, 9, 10, 1})); //ans 5

    }

    static int BinarySearch(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid=0;
        while(start<end){
            mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end; //return start - "return mid will not work"
    }

}
