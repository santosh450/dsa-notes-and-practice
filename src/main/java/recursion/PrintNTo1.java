package recursion;

public class PrintNTo1 {

    static void display(int current) {
        // Base case
        if (current < 1) {
            return;
        }
        System.out.print(current + " ");
        // Recursive call
        display(current - 1);
    }

    public static void main(String[] args) {
        display(10);
    }
}

// Output: 10 9 8 7 6 5 4 3 2 1
