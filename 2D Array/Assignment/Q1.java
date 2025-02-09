package Assignment;
//Print the number of 7’s that are inthe 2d array
//Input - int[][] array = { 
//                         {4,7,8},
//                         {8,8,7} 
//                        };
//Output - 2

public class Q1 {
    public static int search(int matrix[][], int key){
        int time = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(key == matrix[i][j]){
                    time += 1;
                }
            }
        }
        return time;
    }
    public static void main(String[] args) {
        int[][] array = { 
                        {4,7,8},
                        {8,8,7} 
                        };
        System.out.println(search(array, 7));
    }  
}
