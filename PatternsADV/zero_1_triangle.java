public class zero_1_triangle {
    public static void printZero(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("0 ");
        }
    }
    public static void printOne(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("1 ");
        }
    }
    // public static void triangle(int n){
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <=i;j++){
    //             if(i % 2 == 0){
    //                 if(j % 2 != 0){
    //                     printZero(1);
    //                 }
    //                 else{
    //                     printOne(1);
    //                 }
    //                 // for(int k = 1; k <= i; k++){
    //                 // }
    //             }else{
    //                 if(j % 2 == 0){
    //                     printOne(1);
    //                 }else{
    //                     printZero(1);
    //                 }
    //                 // for(int k = 1; k <= i; k++){
    //                 // }
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void logic2(int n){
        for(int i = 1; i <= n; i++){ // outer loop
            for(int j = 1; j <= i; j++){ // inner loop
                if((i + j) % 2 == 0){ // i and j ka sum agar even ata hai to 1 print hoga nahi to 0
                    printOne(1); // calling function to print 1 one time
                }
                else{
                    printZero(1); // calling function to print 0 one time
                }
            }
            System.out.println();
        }
    }
    public static void logicTriangle(int n){
        for(int i = 1; i <= n; i++){ //outer loop
            for(int j = 1; j <= i; j++){ //inner loop
                if(i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0){ // iska mtlb dono i and j odd ho ya phir even ho lekin dono 1 saath hone chaiye
                    printOne(1); //calling function to print 1 one time
                }
                else{
                    printZero(1); // calling function to print 0 one time
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // triangle(5);        
        // logicTriangle(5);
        logic2(5);
    }
}
