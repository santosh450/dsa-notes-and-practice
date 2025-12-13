//https://www.geeksforgeeks.org/problems/second-largest3735/1
package GFG.POTD.NOV_2024;

public class Dec15_GFG1 {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(minRemoval(arr));
    }
    public static int minRemoval(int arr[]) {
        // Code here
        int count =0;
        for (int num: arr
             ) {
            if(num<0)
                count++;
        }
        if(count==arr.length){
            return count-1;
        }
        return count;
    }
}