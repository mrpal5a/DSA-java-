public class SolidRhombus {
    public static void Rhombus(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j<=(n-i); j++){ // this will print white spaces for n-i times in every row
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){ // this wiil print stars n times
                System.out.print("*");
            }
            System.out.println(); // this will move to next row 
        }
    }
    public static void main(String[] args) {
        Rhombus(8);
    }
}
