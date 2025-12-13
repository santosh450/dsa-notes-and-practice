package recursion;

import java.util.ArrayList;

public class CombinationSumII {

    static void display(int[] arr, int sum, int index, int currentSum, ArrayList<Integer> list){
        if(currentSum == sum){
            System.out.println(list);
            return;
        }
        if(currentSum> sum || index== arr.length){
            return;
        }

        // Take
        list.add(arr[index]);
        display(arr, sum, index+1, currentSum+arr[index], list);

        // Not Take and Move to Next
        list.remove(list.size()-1);
        display(arr, sum, index+1, currentSum, list);
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int sum = 8;
        display(arr, sum, 0,0, new ArrayList<Integer>());
    }
}

/*
Output:
[2, 2, 3]
[2, 5]
[3, 4]
[7]
 */

