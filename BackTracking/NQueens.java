public class NQueens {

    public static boolean isSafe(char board[][], int row, int col){
        // vertically up check, if there is any queen above or not, if there is queen above then return false
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left up diagonal check
        for(int i = row-1, j = col-1; i>=0 && j>= 0; j--, i-- ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right up diagonal check
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // if all these conditions are false, that means queen is now safe to SIT, so return true
        return true;
    }
    static int count = 0;
    // making the funtion to boolean, so that we will only print one solution
    // to see all the possible solution, just COMMENT THE ABOVE line where duplicate line is and UNCOMMENT the previous code
    public static boolean nQueens(char board[][], int row){
    // public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
            // return;
        }

        // column loop
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                // nQueens(board, row+1); // recurise funtion call 
                board[row][j] = 'x'; // backtracking step //  yeh likhne se, hum QUEEN ko remove krke dusri possible jagah baitha rahe hai
            }
        }
        //otherwise return false for boolean case
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("----------Chess Board --------" );
        for(int i =0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        // filling initial value of board with dots
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = 'x';
            }
        }
       
        // nQueens(board, 0);
        System.out.println(count );

        // print only one solution of NQueen
         if(nQueens(board, 0)){
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}
