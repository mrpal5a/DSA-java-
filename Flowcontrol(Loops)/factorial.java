// Write a program to find the factorialof any number entered by the user
import java.util.*;
public class factorial {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the factorial ");
    int number = sc.nextInt();
    int factorial = 1;
    if(number == 1 || number == 0){
        System.out.println("Factorial is 1");
    }
    else{
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial is " +factorial);
    }
    sc.close();
   }
}
