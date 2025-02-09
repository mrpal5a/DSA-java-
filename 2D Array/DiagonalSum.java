public class DiagonalSum {
    public static void sum(int matrix[][]){
        int sum = 0;
            //below code is very general and time complexity is O(n^2)
            // for(int i = 0; i < matrix.length; i++){ 
            //     for(int j = 0; j < matrix[0].length;j++){
            //         if((i+j) == matrix.length - 1){ // (i+j) == 3;
            //             sum += matrix[i][j];
            //         }
            //         else if(i == j){
            //             sum += matrix[i][j];
            //         }
            //     }
            // }
        
        //optimized code
        // in this optimized time complexity is O(n), means linear complexity
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length - i -1){
                sum += matrix[i][matrix.length-1-i]; // from i+j = n - 1, we can write j = n - i -1, so we wrote this in our formula, where n is the length of matrix or matrix.length
            }
        }
       System.out.println("Diagonal sum is "+sum);
    }
    public static void main(String[] args) {
        // int matrix[][] = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        sum(matrix);
    }
}
