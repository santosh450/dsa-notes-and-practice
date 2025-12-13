//Order Agnostic Binary search

package Algorithem.Searching;

public class BinarySearch03_Order_Agnostic {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 10));
        System.out.println(BinarySearch(new int[]{60, 50, 40, 30, 20, 10}, 10));

        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 50));
        System.out.println(BinarySearch(new int[]{60, 50, 40, 30, 20, 10}, 50));

        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 60));
        System.out.println(BinarySearch(new int[]{60, 50, 40, 30, 20, 10}, 60));

        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 15));
        System.out.println(BinarySearch(new int[]{60, 50, 40, 30, 20, 10}, 15));

    }

    static int BinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

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
