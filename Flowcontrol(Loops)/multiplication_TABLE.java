// Write a program to print the multiplication table of a number N ,entered by the user.
import java.util.*;
public class multiplication_TABLE {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table ");
        int N = sc.nextInt();
        System.out.println("Below is the table of " +N);
        for(int i = 1; i <= 10; i++){
            System.out.println( N+ " x " +i+ " = " +(N*i));
        }
        sc.close();
    }
}
