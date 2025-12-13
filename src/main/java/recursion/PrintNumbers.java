package recursion;

public class PrintNumbers {

    static int n = 1, limit = 10;
    public static void main(String[] args) {
        display();
    }

    private static void display() {
        if(n>limit){
            return;
        }
        System.out.print(n+" ");
        n++;
        display();
    }
}

// Output: 1 2 3 4 5 6 7 8 9 10
