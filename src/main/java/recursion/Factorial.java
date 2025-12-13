package recursion;

public class Factorial {

    static int factorial(int n) {
        // Base case
        if (n == 0 ) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

// Output: Factorial of 5 is: 120
