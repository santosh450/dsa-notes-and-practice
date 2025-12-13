package recursion;

public class Print1ToNBT {

    static void display(int current) {
        // Base case
        if (current < 1) {
            return;
        }

        // Recursive call
        display(current - 1);
        // Backtracking step
        System.out.print(current + " ");
    }

    public static void main(String[] args) {
        display(10);
    }
}

// Output: 1 2 3 4 5 6 7 8 9 10
