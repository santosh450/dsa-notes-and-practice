package maths;

public class gcd {

    public static void main(String[] args) {

    }

    static int solution1(int a, int b){
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static int solution2(int a, int b){
        if (b == 0) {
            return a;
        }
        return solution2(b, a % b);
    }

    static int solution3(int a, int b){
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
