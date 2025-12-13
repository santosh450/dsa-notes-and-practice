 /*
Cycle sort has always 1 to N numbers in array (no duplicates, no missing numbers)
 */


package Algorithem.Sorting;

import java.util.Arrays;

 public class CycleSort {

     public static void main(String[] args) {
         int[] arr1 = {5, 3, 4, 2, 1};
         cycleSort(arr1);
         System.out.println(Arrays.toString(arr1));

     }

     static void cycleSort(int[] arr){
         int i =0;
         while(i<arr.length){
             int correct = arr[i]-1;
             if(arr[i]!=arr[correct]){
                 swap(arr, i, correct);
             }else{
                 i++;
             }
         }
     }

     static void cycleSortMine(int[] arr){
         int i =0;
         while(i<arr.length){
              int correct = arr[i]-1;
              if(correct!=i){
                  swap(arr, i, correct);
              }else{
                  i++;
              }
         }
     }


     static void cycleSortBaDApprocahe(int[] arr){

         for (int i=0;i<arr.length-1;i++){
             while(arr[i]==i+1) {
                swap(arr, i, arr[i]-1);
             }
         }
     }
     static void swap(int[] arr, int ind1, int ind2){
         int temp = arr[ind1];
         arr[ind1] = arr[ind2];
         arr[ind2] = temp;
     }


 }
