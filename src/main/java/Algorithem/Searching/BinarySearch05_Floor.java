
/* Floor of a number
Floor = greatest element in array smaller or = target
*/
package Algorithem.Searching;

public class BinarySearch05_Floor {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 10));  //Ans: 10
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 25));  //Ans: 20
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 42));  //Ans: 40
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 15));  //Ans: 10
        System.out.println(BinarySearch(new int[]{10, 20, 30, 40, 50, 60}, 60));  //Ans: 60


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
                return arr[mid];
            }
        }
        return arr[end];
    }

}
