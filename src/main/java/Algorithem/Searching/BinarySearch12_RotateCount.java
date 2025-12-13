/*



 */
package Algorithem.Searching;

public class BinarySearch12_RotateCount {

    public static void main(String[] args) {

        System.out.println("Output2: "+solution(new int[]{5, 6, 7, 8, 1, 2}));
        System.out.println("Output2: "+solution(new int[]{5, 6, 7, 8, 9, 10}));

    }


    static int solution(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
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
