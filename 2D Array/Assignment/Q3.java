package Assignment;
//Write a program to Find Transpose of a Matrix.
//What is Transpose?
//Transpose of a matrix is the process ofswapping the rows to columns. For a 2x3 matrix
public class Q3 {
    public static void transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];
        for(int i = 0; i<= row-1; i++){
            for(int j = 0; j <= col-1; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed matrix");
        print(transpose);
    }
    public static void print(int matrix[][]){
        for(int i = 0; i<= matrix.length-1; i++){
            for(int j = 0; j <= matrix[0].length-1; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
          {11,12,13},
          {21,22,23},
          {31,32,33}
        };
        System.out.println("Original matrix");
        print(matrix);
        transpose(matrix);
    }
}
