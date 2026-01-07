package maths;

public class BinarySearchSquareRoot {

    public static void main(String[] args) {
        int num = 40;
        int precision = 3;

        System.out.println("Square root of " +solution(num, precision));
    }

    private static double solution(int num, int precision) {
        int s = 0, e = num;
        double root = 0.0;
        while(s <= e){
            int m = s + (e-s)/2;
            if(m*m == num){
                return m;
            }
            else if(m*m > num){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }

        // floor value of sqrt
        root = e;

        double incr = 0.1;
        for(int i=0; i<precision; i++) {
            while (root * root <= num){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
