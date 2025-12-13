/*

https://leetcode.com/problems/find-in-mountain-array/description/

Mountain array/ Bitonic

 */
package Algorithem.Searching;

public class BinarySearch10_BitonicArray1095 {

    public static void main(String[] args) {
        System.out.println("Output: "+solution(new int[]{5, 6, 7, 8, 6, 5}, 6));  //ans 1
        System.out.println("Output: "+solution(new int[]{5, 6, 7, 3, 2, 1}, 2));  //ans 4
        System.out.println("Output: "+solution(new int[]{5, 6, 7, 8, 9, 10, 1}, 10)); //ans 5
        System.out.println("Output: "+solution(new int[]{5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}, 4)); //ans 11
        System.out.println("Output: "+solution(new int[]{5, 6, 7, 8, 9, 10, 1}, 2)); //ans -1

    }


    static int solution(int[] arr, int target){
        int peak = findPeak(arr);
        int sol = orderAgnosticBS(arr, target, 0, peak);
        if(sol==-1){
            sol = orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }
        return sol;
    }

    static int findPeak(int[] arr) {
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

            boolean isAsc = arr[start]<arr[end];

            while(start<=end){
                int mid = start+(end-start)/2;

                if(arr[mid]==target){
                    return mid;
                }

                if(isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }

}
