//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 */
package Algorithem.Searching;

public class BinarySearch06_Leet744 {

    public static void main(String[] args) {
        System.out.println(BinarySearch(new char[]{'a', 'b'}, 'z'));       //Ans: a
        System.out.println(BinarySearch(new char[]{'c', 'f', 'j'}, 'a'));  //Ans: c
        System.out.println(BinarySearch(new char[]{'c', 'f', 'j'}, 'c'));  //Ans: f
        System.out.println(BinarySearch(new char[]{'c', 'f', 'j'}, 'd'));  //Ans: f
        System.out.println(BinarySearch(new char[]{'c', 'f', 'j'}, 'g'));  //Ans: j
        System.out.println(BinarySearch(new char[]{'c', 'f', 'j'}, 'j'));  //Ans: c
        System.out.println(BinarySearch(new char[]{'x', 'x', 'y', 'y'}, 'z'));  //Ans: x



    }

    static char BinarySearch(char[] arr, char target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }

}
