/*

https://leetcode.com/problems/search-in-rotated-sorted-array/description/

Mountain array/ Bitonic

 */
package Algorithem.Searching;

public class BinarySearch11_RotatedArray33 {

    public static void main(String[] args) {
        System.out.println("Output: "+findPivot(new int[]{5, 6, 7, 8, 1, 2}));  //ans 3
        System.out.println("Output: "+findPivot(new int[]{15, 6, 7, 8, 9, 10}));  //ans 0
        System.out.println("Output: "+findPivot(new int[]{5, 6, 7, 8, 9, 10}));  //ans 5 //check this //array is not rotated
        System.out.println("Output: "+findPivot(new int[]{15, 16, 7, 8, 9, 10, 11, 12}));  //ans 1
        System.out.println("Output: "+findPivot(new int[]{7, 8, 9, 10, 11, 12, 1, 2}));  //ans 5

        System.out.println("Output2: "+solution(new int[]{5, 6, 7, 8, 1, 2}, 2));
        System.out.println("Output2: "+solution(new int[]{5, 6, 7, 8, 9, 10}, 9));

    }


    static int solution(int[] arr, int target){
        int pivot = findPivot(arr);
        int sol = -1;
        // array is not rotated, its just a sorted array
        if(pivot==-1){
            sol = BinarySearch(arr, target, 0, arr.length-1);
        }
        else {
            if(pivot==target){
                sol = pivot;
            }
            else if(target>=arr[0]) {
                sol = BinarySearch(arr, target, 0, pivot-1);
            }
            else {
                sol = BinarySearch(arr, target, pivot+1, arr.length-1);
            }
        }
        return sol;
    }

    // Not for duplicates
    static int findPivot(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid = start+(end-start)/2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
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
