import java.util.*;
public class ex_for {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the value for that much time you want to print the line");
        // int n = sc.nextInt();
        // // int n = 20;
        // for(int i = 0; i < n; i++){
        //     System.out.println("Anshu is coding");
        // }
        // System.out.println("Above code is printed " + n + " times");

        // PRINT SQUARE PATTERN

        // System.out.println("Enter the number for that size you want to print the square");
        // int count = sc.nextInt();
        // // String str = "*********";
        // for(int j = 0;j<count;j++){
        //     for(int i = 0; i < count; i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // PRINT REVERSE OF A NUMBER

        // System.out.println("Enter the number you want to reverse");
        // int n = sc.nextInt();
        // // int n = 5804;
        // while(n>0){
        //     int last_digit = n % 10; // yeh wali line number ka last digit nikal ke degi jaise ki first roung hamara last_digit hoga 4
        //     n /= 10; // yeh wali line last digit ko number se remove karegi jaise ki first round mau hamra n hoga 580
        //     System.out.print(last_digit);
        // }

        //REVERSE THE NUMBER

        System.out.println("Enter the number you want to reverse");
        int n = sc.nextInt();
        // int n = 10899;
        int reversed_number = 0;
        while(n>0){
            int last_digit = n % 10;
            n = n /10;
            reversed_number = (reversed_number * 10) + last_digit;
        }
        System.out.println(reversed_number);
        sc.close();
    }
}
