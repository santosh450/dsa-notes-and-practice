package DataStructure.Arrays;

public class Arrays04_Max {

    public static void main(String[] args){

        int[] num = {10, 20, 90, 40, 50, 60, 70, 12, 13, 103, 85, 16};
        System.out.println(maximum(num));
        System.out.println(maxRange(num, 5, 8));
    }

    public static int maximum(int[] arr){
        int max = arr[0];
        for(int val: arr){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
    public static int maxRange(int[] arr, int start, int end){

        if(end>start){
            return -1;
        }

        if(arr == null){
            return -2;
        }
        int maxRange = arr[start];
        for(; start<=end; start++){
            if(arr[start]>maxRange){
                maxRange=arr[start];
            }
        }
        return maxRange;
    }

}
