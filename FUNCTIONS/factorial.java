import java.util.*;
public class factorial{
    public static int fact(int n){
        // a *= fact(a-1);
        // return a * fact(a - 1);

        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to find factorial ");
        int a = sc.nextInt();
        int fac = fact(a);
        System.out.println("Factorial of " +a+ " is " +fac);
    }
}