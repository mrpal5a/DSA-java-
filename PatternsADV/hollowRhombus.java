public class hollowRhombus {
    public static void Rhombus(int n){
        for(int i = 1; i<= n; i++){
            //white spaces
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            // hollow rhombus is just a hollow rectangle just after the white spaces
            // so above we have printed the white spaces
            
            // hollow rectangle
            for(int j = 1; j<=n; j++){
                if(j == 1 /* if it is first col*/|| j == n /*if it is last col */ || i == 1 /*if it is first row */ ||i == n /*if it is last row */){
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
        Rhombus(5);
    }
}
