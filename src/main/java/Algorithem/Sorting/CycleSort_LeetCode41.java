 /*
https://leetcode.com/problems/first-missing-positive/description/
 */



package Algorithem.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class CycleSort_LeetCode41 {

     public static void main(String[] args) {
         //Range is 1 to n
         int[] arr1 = {4,5,2,7,8,2,3,1};
         System.out.println("missing smallest positive integer: "+cycleSortSolution(arr1));
         System.out.println(Arrays.toString(arr1));

         int[] arr2 = {1,2,0};
         System.out.println("missing smallest positive integer: "+cycleSortSolution(arr2));
         System.out.println(Arrays.toString(arr2));

         int[] arr3 = {3,4,-1,1};
         System.out.println("missing smallest positive integer: "+cycleSortSolution(arr3));
         System.out.println(Arrays.toString(arr3));

         int[] arr4 = {7,8,9,11,12};
         System.out.println("missing smallest positive integer: "+cycleSortSolution(arr4));
         System.out.println(Arrays.toString(arr4));

         int[] arr5 = {1, 2, 3};
         System.out.println("missing smallest positive integer: "+cycleSortSolution(arr5));
         System.out.println(Arrays.toString(arr5));

     }




     static int cycleSortSolution(int[] arr){
         int i =0;
         while(i<arr.length){
                 int correct = arr[i] - 1;
                 //if ( correct < arr.length && correct >= 0 && arr[i] != arr[correct] ) {  both will work
                if ( arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[correct] ) {
                     swap(arr, i, correct);
                 } else {
                     i++;
                 }
             }

         for(int index=0; index< arr.length; index++){
             if(arr[index]!=index+1)
                 return index+1;

         }
         return arr.length+1;
     }


     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }



 }
