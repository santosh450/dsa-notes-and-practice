package Algorithem.Searching;

public class LinearSearch01 {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{10, 20, 30, 40, 50, 60}, 40));
        System.out.println(linearSearch(new int[]{10, 20, 30, 40, 50, 60}, 45));
        System.out.println(linearSearch(new int[]{}, 40));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0; index<arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }

        return -1;
    }
}
