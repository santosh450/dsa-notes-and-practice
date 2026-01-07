package maths;

public class Factors {

    public static void main(String[] args) {
        bruteforce(20);
        solution2(20);
    }

    private static void bruteforce(int num) {
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }

    private static void solution2(int num) {
        for (int i = 1; i*i < num; i++) {
            if(num%i==0){
                if(num/i == i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " "+num/i+" ");
                }
            }
        }
    }
}
