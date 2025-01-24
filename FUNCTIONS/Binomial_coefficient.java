import java.util.*;
public class Binomial_coefficient{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static int Binomial(int n, int r){
        int bin = factorial(n)/(factorial(r)* factorial( n - r));
        return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("To find the value of Binomial coefficient");
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int coefficient = Binomial(n, r);
        System.out.println("Binomial coefficient is " +coefficient);
    }
}