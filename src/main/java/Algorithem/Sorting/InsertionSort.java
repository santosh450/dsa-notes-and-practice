 /*

 */


package Algorithem.Sorting;

import java.util.Arrays;

 public class InsertionSort {

     public static void main(String[] args) {
         int[] arr1 = {5, 3, 4, 2, 1};
         insertionSort(arr1);
         System.out.println(Arrays.toString(arr1));

     }


     static void insertionSort(int[] arr){

         for (int i=0;i<arr.length-1;i++){
             for(int j=i+1; j>0; j--){
                 if(arr[j-1]>arr[j]){
                     swap(arr, j-1, j);
                 }else{
                     break;
                 }
             }
         }
     }

     static int getMaxIndex(int[] arr, int start, int end){
         int max = start;
         for(int i=start; i<=end; i++){
             if(arr[max]<arr[i])
               max = i;
         }
         return max;
     }

     static void swap(int[] arr, int max, int index){
         int temp = arr[max];
         arr[max] = arr[index];
         arr[index] = temp;
     }


 }
