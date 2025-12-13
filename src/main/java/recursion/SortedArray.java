package recursion;

public class SortedArray {

    static boolean isSorted(int[] arr, int index){
        if(arr.length-1 == index){
            return true;
        }

        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 88, 96, 100};
        System.out.println(isSorted(arr, 0));
        int[] arr2 = {1, 5, 88, 96, 10};
        System.out.println(isSorted(arr2, 0));

    }
}
