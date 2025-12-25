package recursion.backTracking;

public class NKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0, 0, 8));
    }


    static int knights(boolean[][] board, int row, int col, int knight){
        if(knight==0){
            display(board);
            return 1;
        }
        if(row == board.length-1 && col == board.length){
            return 0;
        }

        if(col == board.length){
            return knights(board, row+1, 0, knight);
        }

        int count = 0;
        if(isSafe(board, row, col)){
            board[row][col] = true;
            count += knights(board, row, col+1, knight-1);
            board[row][col] = false;
        }

        count += knights(board, row, col+1, knight);

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
        if(isValid(board, row-2, col+1)) {
            if (board[row-2][col+1]) {
                return false;
            }
        }
        if(isValid(board, row-1, col-2)) {
            if (board[row-1][col-2]) {
                return false;
            }
        }
        if(isValid(board, row-1, col+2)) {
            if (board[row-1][col+2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c){
        return r>=0 && r<board.length && c>=0 && c<board.length;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
