package recursion.backTracking;

public class Maze {

    public static void main(String[] args) {
        System.out.println(count(3,3));
        path01("",3,3);
        path02Diagonal("",3,3);

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestriction("", board, 0,0);
    }

    // mine
    static int count(int r, int c) {
        if(r==1 && c==1){
            return 1;
        }
        if(r<1 || c<1){
            return 0;
        }
        int right = count(r-1, c);
        int down = count(r, c-1);
        return right+down;
    }

    //Optimal
    static int count01(int r, int c) {
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r-1, c);
        int down = count(r, c-1);
        return right+down;
    }

    // Path
    static void path(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r<1 || c<1){
            return;
        }
        path(p+'D',r-1, c);
        path(p+'R',r, c-1);
    }

    // Kunal
    static void path01(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) {
            path01(p + 'D', r - 1, c);
        }
        if(c>1) {
            path01(p + 'R', r, c - 1);
        }
    }

    // Kunal
    static void path02Diagonal(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1) {
            path02Diagonal(p + 'D', r - 1, c);
        }
        if(c>1) {
            path02Diagonal(p + 'R', r, c - 1);
        }
        if(r>1 && c>1){
            path02Diagonal(p + 'd', r-1, c - 1);
        }
    }

    //Maze with obstacle
    static void pathRestriction(String p,boolean[][] maze,  int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if(c<maze[0].length-1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }

}
