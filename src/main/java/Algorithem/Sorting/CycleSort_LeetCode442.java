 /*
https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */



package Algorithem.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 public class CycleSort_LeetCode442 {

     public static void main(String[] args) {
         //Range is 1 to n
         int[] arr1 = {4,3,2,7,8,2,3,1};
         System.out.println("duplicate num: "+cycleSortSolution(arr1));
         System.out.println(Arrays.toString(arr1));

         int[] arr2 = {1,1,2};
         System.out.println("duplicate num: "+cycleSortSolution(arr2));
         System.out.println(Arrays.toString(arr2));

         int[] arr3 = {1};
         System.out.println("duplicate num: "+cycleSortSolution(arr3));
         System.out.println(Arrays.toString(arr3));

         int[] arr4 = {3, 2, 1, 4, 8, 5, 7, 3};
         System.out.println("duplicate num: "+cycleSortSolution(arr4));
         System.out.println(Arrays.toString(arr4));

     }




     static List<Integer> cycleSortSolution(int[] arr){
         int i =0;
         List<Integer> list = new ArrayList<>();
         while(i<arr.length){
                 int correct = arr[i] - 1;
                 if (arr[i] != arr[correct]) {
                     swap(arr, i, correct);
                 } else {
                     i++;
                 }
             }

         for(int index=0; index< arr.length; index++){
             if(arr[index]!=index+1)
                 list.add(arr[index]);

         }
         return list;
     }


     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }




 }
