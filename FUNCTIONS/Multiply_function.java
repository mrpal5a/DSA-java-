import java.util.*;
public class Multiply_function{
    public static int multiply(int a, int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Multiplier ");
        int a = sc.nextInt();
        System.out.print("Enter the value of Multiplicant ");
        int b = sc.nextInt();
        int multi = multiply(a,b);
        System.out.println("Multiplication of " +a+ " and " +b+ " is " +multi);
    }
}