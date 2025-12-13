package recursion;

public class PrintNTimes {

    static void display(int current, int n) {
        // Base case
        if (current > n) {
            return;
        }
        System.out.println(current+ ". Hello World");
        // Recursive call
        display(current + 1, n);
    }

    public static void main(String[] args) {

        display(1, 5);
    }
}

/*
 Output:
 1. Hello World
 2. Hello World
 3. Hello World
 4. Hello World
 5. Hello World
 */
