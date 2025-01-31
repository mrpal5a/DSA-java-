

public class hollowRectangle {
    public static void hollow_Rectangle(int row, int col){
        // outer loop through 1 to n
        for(int i = 1; i <= row; i++){
            //inner loop
            for(int j = 1; j <= col; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                // if(i == 1 && i == row && j ==1 && j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(6, 10);
    }
}
