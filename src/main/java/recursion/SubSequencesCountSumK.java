package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesCountSumK {

    static int printSequence(int i, int n, int[] org, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                return 1;
            }
            return 0;
        }

        //Take
        currentSum += org[i];
        int left = printSequence(i+1, n, org, currentSum, expected);

        // Not take → remove the last added element
        currentSum -= org[i];
        int right = printSequence(i+1, n, org, currentSum, expected);
        return left+right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(printSequence(0, 3, arr, 0, 2));
    }
}

/*
Output:
[1, 1]
[2]
 */
