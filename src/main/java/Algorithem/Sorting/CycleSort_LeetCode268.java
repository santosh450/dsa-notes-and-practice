 /*
https://leetcode.com/problems/missing-number/description/
 */



package Algorithem.Sorting;

import java.util.Arrays;

 public class CycleSort_LeetCode268 {

     public static void main(String[] args) {
         //Range is 0 to n
         int[] arr1 = {5, 3, 4, 2, 6, 0};
         System.out.println("missing num: "+cycleSortSolution(arr1));
         System.out.println(Arrays.toString(arr1));

     }




     static int cycleSortSolution(int[] arr){
         int i =0;
         while(i<arr.length){
             int correct = arr[i];
             if(correct<arr.length && arr[i]!=arr[correct]){
                 swap(arr, i, correct);
             }else{
                 i++;
             }
         }
         for(int j =0; j< arr.length; j++){
             if(j!=arr[j]){
                 return j;
             }
         }
         return arr.length;
     }


     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }




 }
