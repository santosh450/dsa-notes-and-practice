//https://www.geeksforgeeks.org/problems/second-largest3735/1
package GFG.POTD.NOV_2024;

public class Dec15_GFG2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(minCost(arr));
    }
    public static int minCost(int arr[]) {
        // Code here
        int odd = 0;
        int even =0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if((i+1)%2==1){
                if(arr[i]%2==1){
                    continue;
                }else {
                    if(odd==0)
                    odd=arr[i];
                    else {
                        return -1;
                    }
                }
            }
            else {
                if(arr[i]%2==0){
                    continue;
                }else {
                    if(even==0)
                        even=arr[i];
                    else {
                        return -1;
                    }
                }
            }
            if(odd!=0 && even!=0 ){
                count = count+odd+even;
                odd=0;
                even=0;
            }
        }
        if(odd!=0 || even!=0){
            return -1;
        }
        return count;
    }

}