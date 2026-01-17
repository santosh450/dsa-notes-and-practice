package stacksQueues;

import java.util.Arrays;

public class TwoStacks {

    public int twoStacksSolution(int max, int[] a, int[] b){
        return solution(max, a, b, 0, 0)-1;
    }

    private int solution(int max, int[] a, int[] b, int currentSum, int count) {
        if(currentSum>max){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }

        int takeA = solution(max, Arrays.copyOfRange(a, 1, a.length), b, currentSum+a[0], count+1);
        int takeB = solution(max, a, Arrays.copyOfRange(b, 1, b.length), currentSum+b[0], count+1);

        return Math.max(takeA, takeB);
    }
}
