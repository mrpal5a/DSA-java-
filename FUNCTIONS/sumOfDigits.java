import java.util.*;
public class sumOfDigits{
    public static int DigitsSum(int number){
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the sum of digits ");
        int number  = sc.nextInt();
        int sum = DigitsSum(number);
        System.out.println("Sum of " +number+ " is " +sum);
    }
}