
//Ascending order array

package Algorithem.Searching;

public class BinarySearch01 {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 10));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 50));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 60));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 15));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60, 70}, 10));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60, 70}, 60));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60, 70}, 70));
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60, 70}, 15));

    }

    static int BinarySearch(int[] arr, int target){
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
                return mid;
            }
        }
        return -1;
    }

}
