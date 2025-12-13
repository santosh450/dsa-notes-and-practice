package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesSumK {

    static void printSequence(int i, int n, int[] org, List<Integer> l, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                System.out.println(l);
            }
            return;
        }

        //Take
        l.add(org[i]);
        currentSum += org[i];
        printSequence(i+1, n, org, l, currentSum, expected);

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        currentSum -= org[i];
        printSequence(i+1, n, org, l, currentSum, expected);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        printSequence(0, 3, arr, new ArrayList<>(), 0, 2);
    }
}

/*
Output:
[1, 1]
[2]
 */
