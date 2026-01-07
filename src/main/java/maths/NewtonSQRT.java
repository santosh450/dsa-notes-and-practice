package maths;

public class NewtonSQRT {

    public static void main(String[] args) {
        System.out.println(solution(40));
    }

    private static double solution(int num) {
        double x = num;
        double root;
        while(true){
            root = 0.5 * ( x + (num/x));

            if(Math.abs(root-x) < 0.5){ //accuracy
                break;
            }
            x = root;
        }
        return root;
    }
}
