package recursion;

public class PrintNTo1BT {

    static void display(int current, int max) {
        // Base case
        if (current > max) {
            return;
        }
        // Recursive call
        display(current + 1, max);
        // Backtracking step
        System.out.print(current + " ");
    }

    public static void main(String[] args) {
        display(1, 10);
    }
}

// Output: 10 9 8 7 6 5 4 3 2 1
