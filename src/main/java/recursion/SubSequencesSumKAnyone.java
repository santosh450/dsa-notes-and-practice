package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesSumKAnyone {

    static boolean printSequence(int i, int n, int[] org, List<Integer> l, int currentSum, int expected){
        if(i==n){
            if(currentSum == expected) {
                System.out.println(l);
                return true;
            }
            return false;
        }


        //Take
        l.add(org[i]);
        currentSum += org[i];
        if(printSequence(i+1, n, org, l, currentSum, expected)){
            return true;
        }

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        currentSum -= org[i];
        if(printSequence(i+1, n, org, l, currentSum, expected)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(printSequence(0, 3, arr, new ArrayList<>(), 0, 2));
    }
}

/*
Output:
[1, 1]
[2]
 */
