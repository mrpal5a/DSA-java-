import java.util.*;

public class ex_while{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int count = 100;
        while(count > 0){
            System.out.println("Anshu is coding");
            count--; // condition jo hame while loop se bahar le kr jayegi, yeh condition hame hamesha likhni padti hai warna yeh infinite loop mai chala jayega or system crash ho sakta hai
        }

        // int number = 0;
        // System.out.println("enter the number you want to print");
        // int n = sc.nextInt();
        // while (number < n) {
        //     System.out.println(number + 1);
        //     number++;
        // }

        // SUM OF FIRST N NATURAL NUMBERS

        System.out.println("enter the number till you want to find the sum of natural numbers");
        int number = sc.nextInt();
        int sum = 0;
        int n = 0;
        while(n <= number){
            sum += n;
            n++;
        }
        System.out.print("Sum of N natural numbers is " + sum);
        sc.close();
    }
}