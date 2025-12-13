package recursion;

import java.util.ArrayList;

public class SearchElement {

    public static void main(String[] args) {
        int[] arr = {4, 8, 78, 55, 0, 11, 0, 0};
        int target = 0;
        System.out.println(foundElement(arr, target, 0));
        System.out.println(foundIndex(arr, target, 0));
        System.out.println(foundLastIndex(arr, target, arr.length-1));
        System.out.println(foundLastIndex2(arr, target, 0));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 =  foundAllIndex(arr, target, 0, list1);
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> list3 =  foundAllIndex2(arr, target, 0);
        System.out.println(list3);

    }

    private static boolean foundElement(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || foundElement(arr, target, index+1);
    }

    private static int foundIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return foundIndex(arr, target, index+1);
    }

    private static int foundLastIndex(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return foundLastIndex(arr, target, index-1);
    }

    private static int foundLastIndex2(int[] arr, int target, int index) {

        if(index == arr.length){
            return -1;
        }

        int ans =  foundLastIndex2(arr, target, index+1);

        if (ans != -1) {
            return ans;
        }

        if(arr[index] == target){
            return index;
        }
        return ans;
    }

    // ArrayList<Integer> list inside parameter - Makes different references but all points to same object
    private static ArrayList<Integer> foundAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return foundAllIndex(arr, target, index+1,list);
    }

    // ArrayList<Integer> list inside function - new object objects
    private static ArrayList<Integer> foundAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer>  ansFromBelowCalls = foundAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}
