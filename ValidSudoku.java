import java.util.*;
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){

            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();

            for(int j=0;j<9;j++){
                char r = board[i][j];
                char c = board[j][i];
                //checking the rows
                if(r != '.'){
                    if(!rows.contains(r)){
                        rows.add(r);
                    }else{
                        return false;
                    }
                }
                //checking the columns
                if(c != '.'){
                    if(!cols.contains(c)){
                        cols.add(c);
                    }else{
                        return false;
                    }
                }
            }
        }
        //now we have to check 3x3 grids(boxes)
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!helper(i,j,board)){
                    return false;
                }
            }
        }
        //if it passes all the checks, then the sudoku is valid W
        return true;
    }
    public boolean helper(int a, int b, char[][] board){
        HashSet<Character> grid = new HashSet<>();

        int rows = a + 3;
        int cols = b + 3;

        for(int i=a;i<rows;i++){
            for(int j=b;j<cols;j++){
                //skip the empty spaces
                if(board[i][j] == '.'){
                    continue;
                }

                //check if the value repeats in the grid
                if(grid.contains(board[i][j])){
                    return false;
                }
                //if the value is not present in the grid add it into the set
                grid.add(board[i][j]);
            }
        }
        //if it passes all the checks then the 3x3 grid is valid
        return true;
    }
}
