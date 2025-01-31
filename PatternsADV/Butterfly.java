public class Butterfly {
    public static void pattern(int n){ // here n should be even
        for(int i = 1; i<= n/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       for(int i = 4; i >= 1; i--){
            for(int j = 4; j <= i; j--){
                System.out.print("* ");
            }
        System.out.println();
       }
    }
    public static void printSpace(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(" ");
        }
    }
    public static void printStar(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
    public static void BPattern(int n){
        // this for loop for printing upper part
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= 1; j++){
                printStar(i); // it will print the Stars according to line number, if line is 1 then it will print 1 star and so on
                int space = 2*(n - i); // it will print the white spaces (2*totalline - number of line)  as line number increases white spaces will decrese
                printSpace(space);// 
                printStar(i); // it will print the start according to line number, if line is 1 then it will print 1 star and so on, but at the end of line means it will print stars after white spaces
            }
            System.out.println();
        }
        // this for loop for printing the lower part or inverted part
        for(int i = n; i >= 1; i--){
            for(int j = 1; j>= 1; j--){
                printStar(i);
                int space = 2*(n - i);
                printSpace(space);
                printStar(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // pattern(8);
        BPattern(5);
    }
}
