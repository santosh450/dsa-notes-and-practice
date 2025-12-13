package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {

    static void printSequence(int i, int n, int[] org, List<Integer> l){
        if(i==n){
            System.out.println(l);
            return;
        }

        //Take
        l.add(org[i]);
        printSequence(i+1, n, org, l);

        // Not take → remove the last added element
        l.remove(l.size() - 1);
        printSequence(i+1, n, org, l);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        printSequence(0, 3, arr, new ArrayList<>());
    }
}

/*
Output:
[3, 1, 2]
[3, 1]
[3, 2]
[3]
[1, 2]
[1]
[2]
[]
 */
