package recursion;

public class SubsetSumI {

    static void display(int[] arr, int index, int totalElements, int sum){
        if(index == totalElements){
            System.out.println(sum);
            return;
        }
        // Take and move to next index
        display(arr, index+1, totalElements, sum+arr[index]);
        // NOT Take and move to next index
        display(arr, index+1, totalElements, sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2};
        int noOfElements = arr.length;
        display(arr,0 ,noOfElements, 0);

    }
}
