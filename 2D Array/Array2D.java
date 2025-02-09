import java.util.*;
public class Array2D {
    //searching the element in the array
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(key == matrix[i][j]){
                    System.out.println("Found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int matrix[][] = new int[3][3]; // it will create matrix of 3x3
        int n = 3, m = 3;
        // int n  = matrix.length;
        // m = matrix[0].length; // mtlb matrix ke first row ki length

        // taking input in matrix
        // for(int i = 0; i < n; i++){
        //     for(int j  = 0; j < m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        int matrix [][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // printing the matrix
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int key = 8;
        //search the element
        if(search(matrix, key) == false){
            System.out.println(key+" Not found");
        }
    }
}
