package recursion;

public class SumNParameterised {

    static void sum(int n, int sum) {
        // Base case
        if (n < 1) {
            System.out.println("Sum is: " + sum);
            return;
        }
        // Recursive call
        sum(n - 1, sum+n);
    }

    public static void main(String[] args) {

        sum(5, 0);
    }
}

// Output: Sum is: 15
