package recursion;

public class Print1ToN {

    static void display(int current, int n) {
        // Base case
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        // Recursive call
        display(current + 1, n);
    }

    public static void main(String[] args) {
        display(1, 10);
    }
}

// Output: 1 2 3 4 5 6 7 8 9 10
