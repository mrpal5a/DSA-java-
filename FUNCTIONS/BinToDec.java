import java.util.*;
public class BinToDec{
    public static int BintoDec(int n){
        int power = 0; // power ko initiliaze kar rahe hai 0 se
        int dec = 0; // starting mai decimal ki value 0 hai
        do {
            
            int lastDigit = n % 10; // number ka last digit milega yeh se
            dec = dec + (lastDigit * ((int)(Math.pow(2, power)))); // decimal mai add kar rha hai value ko
            // iska formula hai -> dec = dec + (lastDigit * (2 ** pow))
            n = n / 10; // number mai se last digit remove ho jayega is se
            power++;
        } while (n>0);
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number to convert in binary ");
        int number = sc.nextInt();
        System.out.println("Decimal of " +number+ " is " +BintoDec(number));
        sc.close();
    }
}