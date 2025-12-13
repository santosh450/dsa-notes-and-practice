 /*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */



package Algorithem.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class CycleSort_LeetCode448 {

     public static void main(String[] args) {
         //Range is 1 to n
         int[] arr1 = {4,3,2,7,8,2,3,1};
         System.out.println("missing num: "+cycleSortSolution(arr1));
         System.out.println(Arrays.toString(arr1));

         int[] arr2 = {4,3,2,7,2,2,3,1};
         System.out.println("missing num: "+cycleSortSolution(arr2));
         System.out.println(Arrays.toString(arr2));

         int[] arr3 = {1, 1};
         System.out.println("missing num: "+cycleSortSolution(arr3));
         System.out.println(Arrays.toString(arr3));

         int[] arr4 = {1, 2, 3, 4, 3, 2, 7, 8};
         System.out.println("missing num: "+cycleSortSolution(arr4));
         System.out.println(Arrays.toString(arr4));

     }




     static List<Integer> cycleSortSolution(int[] arr){
         int i =0;
         List<Integer> l1 = new ArrayList();
         while(i<arr.length){
             int correct = arr[i]-1;
             if( correct<arr.length && arr[i]!=arr[correct]){
                 swap(arr, i, correct);
             }else{
                 i++;
             }
         }
         for(int j =1; j<= arr.length; j++){
             if(j!=arr[j-1]){
                 l1.add(j);
             }
         }
         return l1;
     }


     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }




 }
