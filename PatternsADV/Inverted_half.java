package PatternsADV;

public class Inverted_half {
    public static void half_pyramid(int n){
        // outer loop
        for(int i = 1; i <= n; i++){
            // below loop is for printing the spaces before the star prints
            for(int j = 1; j <= n-i; j++ ){
               System.out.print(" ");
            }
            // below loop to print stars(*) after white spaces
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid(4);
    }
}
