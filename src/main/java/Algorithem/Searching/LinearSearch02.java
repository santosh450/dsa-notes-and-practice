package Algorithem.Searching;

public class LinearSearch02 {

    public static void main(String[] args) {
        System.out.println(min(new int[]{10, 20, 30, 40, 50, 60}));
        System.out.println(min(new int[]{40, 80, 33, 11, 20, 30, 40, 50, 60}));
    }

    static int min(int[] arr){
        int min = arr[0];

        for(int val: arr){
            if(val<min){
                min = val;
            }
        }

        return min;
    }
}
