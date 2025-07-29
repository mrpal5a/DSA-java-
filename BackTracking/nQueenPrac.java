public class nQueenPrac{

    public static boolean isSafe(char[][] board, int row, int col){
        //if there is queen on vertical up direction
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //if is there any queen any left up diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //if is there any queen on right up diagonal
        for(int i = row - 1, j = col + 1; i >=0 && j< board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //otherwise
        return true;
    }
    public static void nQueen(char[][] board, int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        } 

        //column loop
        for(int j = 0; j< board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                // System.out.println("anshu");
                board[row][j] = 'x';
            }
        }
    }
    public static void printBoard(char[][] board){
        System.out.println("---------- CHESS BOARD ---------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 6;
        char board[][] = new char[n][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
    }
}