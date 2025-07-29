public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        // row wise digit check if exists
        for(int i = 0; i < 9; i++){
            if(sudoku[row][i] == digit){
                return false;
            }
        }

        // column wise digit check if exits
        for(int j = 0; j < 9; j++){
            if(sudoku[j][col] == digit){
                return false;
            }
        }

        // grid wise digit check if exits
 
        // finding the starting index of row and column, so that we can find out which 3x3 grid to analys
        int startingRow = (row/3) * 3;
        int startingCol = (col /3) * 3;

        for(int i = startingRow; i < startingRow + 3; i++){
            for(int j = startingCol; j < startingCol + 3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row == 9){
            return true;
        }

        //recursion
        int nextRow = row, nextCol = col + 1;
        if(col + 1 == 9){ // boundary condition, or moving to next row of sudoku
            nextRow = row + 1;
            nextCol = 0;
        }

        // checking, if the digit is other than 0, so don't change the digit. means it is questions digit and we don't have to alter that digit
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku, row,col,digit)){// if soln exists
                sudoku[row][col] = digit; 
                if(sudokuSolver(sudoku, nextRow, nextCol)){ // checking solm for next sudko
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i = 0; i< 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}
