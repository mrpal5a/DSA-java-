package Assignment;
//Print out the sum of the numbers inthe second row of the “nums” array.
//Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18
public class Q2 {
    public static int sum(int matrix[][], int row){
        int sum = 0;
        for(int j = 0; j < matrix[0].length; j++){
            sum += matrix[row][j];
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println(sum(nums, 1));
    }
}
