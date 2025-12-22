package recursion;

public class Patterns01 {

    public static void main(String[] args) {
        printPattern(5, 0);
        printPattern01(5, 0);
        printPattern02(5, 0);
    }

    static void printPattern(int row, int column){
        if(row==0){
            return;
        }
        if(row == column){
            System.out.println();
            printPattern(row-1, 0);
            return;
        }
        System.out.print("* ");
        printPattern(row, column+1);
    }

    static void printPattern01(int row, int column){
        if(row==0){
            return;
        }
        if(row == column){
            System.out.println();
            printPattern01(row-1, 0);
        } else {
            System.out.print("* ");
            printPattern01(row, column + 1);
        }
    }

    static void printPattern02(int row, int column){
        if(row==0){
            return;
        }
        if(row == column){
            printPattern02(row-1, 0);
            System.out.println();
        } else {
            printPattern02(row, column + 1);
            System.out.print("* ");
        }
    }
}
