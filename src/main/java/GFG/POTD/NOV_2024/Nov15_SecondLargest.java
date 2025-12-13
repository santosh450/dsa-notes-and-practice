//https://www.geeksforgeeks.org/problems/second-largest3735/1
package GFG.POTD.NOV_2024;

public class Nov15_SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));

        int[] arr2 = {10, 5, 10};
        System.out.println(getSecondLargest(arr2));

        int[] arr3 = {10, 10, 10};
        System.out.println(getSecondLargest(arr3));
    }
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int large = arr[0];
        int large2 = arr[0];

        for (int num: arr) {
            if(large<num) {
                large = num;
            }
        }
        int diff = large;
        for (int num: arr) {
            if(large-num>0 && diff > (large-num)){
                large2 = num;
                diff = large-num;
            }
        }
        if(large==large2){
            return -1;
        }
        return large2;
    }
}