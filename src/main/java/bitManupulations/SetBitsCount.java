package bitManupulations;

public class SetBitsCount {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));


    }

    static int count1(int n){
        int count =0;
        while(n>0){
            count++;
            n = n - (n&-n);
        }
        return count;
    }

    static int count2(int n){
        int count =0;
        while(n>0){
            count++;
            n = n & n-1;
        }
        return count;
    }
}
