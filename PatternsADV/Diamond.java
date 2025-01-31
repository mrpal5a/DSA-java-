public class Diamond {
    public static void DiamondP(int n){
        for(int i = 1; i <= n; i++){
            // white spaces
            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= (2*i - 1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            // white spaces
            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= (2*i - 1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        DiamondP(4);
    }
}
