package recursion.backTracking;

public class Sudoku {

    public static void main(String[] args) {

        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solve(sudoku)){
            display(sudoku);
        }
        else {
            System.out.println("Sudoku not be solved");
        }
    }

    private static void display(int[][] sudoku) {
        for(int[] row: sudoku){
            for(int ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for(int i =0; i< n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft) {
            return true; // sudoku solved
        }

        //Backtrack
        for(int num = 1; num<=9; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(solve(board)){
                    return true;
                }
                else {
                    board[row][col] =0;
                }
            }
        }
        return false;
    }


    static boolean isSafe(int[][] board, int row, int col, int num){

        //check row
        for(int i=0; i< board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        //check Column
        for(int[] rows: board){
            if(rows[col] == num){
                return false;
            }
        }

        //check that box
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int r=rowStart; r<rowStart+sqrt; r++){
            for(int c=colStart; c<colStart+sqrt; c++){
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
