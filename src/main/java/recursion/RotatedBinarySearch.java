package recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        for (int x : arr) {
            System.out.println(x + " -> " + isFound(arr, x, 0, arr.length - 1));
        }
        System.out.println(10 + " -> " + isFound(arr, 10, 0, arr.length - 1));

    }

    static int isFound(int[] arr, int target, int left, int right){

        if(left>right){
            return -1;
        }
        int mid = left + (right - left)/2;
        if(target == arr[mid]){
            return mid;
        }

        // Left is sorted
        if(arr[left] <= arr[mid]) {
            if((target < arr[mid]) && target >= arr[left]){
                return isFound(arr, target, left, mid-1);
            }else {
                return isFound(arr, target, mid+1, right);
            }
        }
        // Right is sorted
        else {
            if((target > arr[mid]) && target <= arr[right]){
                return isFound(arr, target, mid+1, right);
            }
            else {
                return isFound(arr, target, left, mid-1);
            }
        }
    }
}
