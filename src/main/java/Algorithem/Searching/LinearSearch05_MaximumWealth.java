package Algorithem.Searching;

public class LinearSearch05_MaximumWealth {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{10, 202, 3085},
                {40452, 5},
                {60, 77, 24, 11, 44, 7}}));
        System.out.println(maximumWealth(new int[][]{{0, -11},
                {-111, 111, -2222}}));
        System.out.println(maximumWealth(new int[][]{{-1, -11, -3085},
                {-40452, -5, -60}}));
    }

    static int maximumWealth(int[][] accounts) {
        int res = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int finalAmount =0;
            for (int amount: person){
                finalAmount += amount;
            }
            if(res<finalAmount){
                res = finalAmount;
            }
        }
        return res;
    }
}
