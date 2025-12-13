 /*
https://leetcode.com/problems/find-the-duplicate-number/description/
 */



package Algorithem.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class CycleSort_LeetCode287 {

     public static void main(String[] args) {
         //Range is 1 to n
         int[] arr1 = {1,3,4,2,2};
         System.out.println("duplicate num: "+cycleSortSolution(arr1));
         System.out.println(Arrays.toString(arr1));

         int[] arr2 = {3,1,3,4,2};
         System.out.println("duplicate num: "+cycleSortSolution(arr2));
         System.out.println(Arrays.toString(arr2));

         int[] arr3 = {3,3,3,3,3};
         System.out.println("duplicate num: "+cycleSortSolution(arr3));
         System.out.println(Arrays.toString(arr3));

         int[] arr4 = {3, 2, 1, 4, 8, 5, 7, 3};
         System.out.println("duplicate num: "+cycleSortSolution(arr4));
         System.out.println(Arrays.toString(arr4));

     }




     static int cycleSortSolution(int[] arr){
         int i =0;
         while(i<arr.length){
             if(arr[i]!=i+1) {
                 int correct = arr[i] - 1;
                 if (arr[i] != arr[correct]) {
                     swap(arr, i, correct);
                 } else {
                     return arr[i];
                 }
             }
             else{
                 i++;
             }
         }
//         for(int j =1; j<= arr.length; j++){
//             if(j!=arr[j-1]){
//                 return arr[j-1];
//             }
//         }
         return -1;
     }


     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }


 }
