public class Search_in_sorted_array {
    public static boolean search(int matrix[][], int key){ // this searching method is also known as staircase search
        // starting point is top right of the matrix, means matrix[row][col] === matrix[0][m-1]
        // int row = 0;
        // int col = matrix[0].length-1;
        // while(row < matrix.length && col >= 0){ // if we reach to the other end of matrix, then we will exit the whille loop
        //     if(key == matrix[row][col]){
        //         System.out.println(key+" found at "+"("+row+","+col+")");
        //         return true;
        //     }else if(key < matrix[row][col]){
        //         col--;
        //     }else{
        //         row++;
        //     }
        // }
        //  System.out.println("Key is not found");
        //  return false;

        // starting point is bottom left of the matrix, means matrix[row][col] === matrix[n-1][0]
        int row = matrix.length-1;
        int col = 0;
        while(row >= 0  && col < matrix[0].length ){ //O(n+m)
            if(key == matrix[row][col]){
                System.out.println(key+" found at "+"("+row+","+col+")");
                return true;
            }else if(key > matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,46},
            {27,29,37,48},
            {32,33,39,50}
        };
        search(matrix, 50);
    }
}
