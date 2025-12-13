package Algorithem.Searching;

import java.util.ArrayList;

public class LinearSearch04_EvenDigits {

    public static void main(String[] args) {
        System.out.println(evenDigits(new int[]{10, 202, 3085, 40452, 5, 60, 77, 24, 11, 44, 7}));
        System.out.println(evenDigits(new int[]{0, -11, -111, 111, -2222}));
        System.out.println(evenDigits(new int[]{-1, -11, -3085, -40452, -5, -60}));

    }

    static int evenDigits(int[] arr) {
        int res = 0;
        for (int val : arr) {
            if (even(val)) {
                res++;
            }
        }
        return res;
    }

    static boolean even(int num){
        return digits2(num)%2==0;
    }

    static int digits(int num) {
        int index = 0;

        if(num==0){
            return 1;
        }

        if(num<0){
            num = num * -1;
        }

        while (num > 0) {
            num = num / 10;
            index++;
        }
        return index;
    }

    //Optimal way
    static int digits2(int num) {

        if(num==0){
            return 1;
        }

        if(num<0){
            num = num * -1;
        }

        return (int) (Math.log10(num)+1);

    }
}
