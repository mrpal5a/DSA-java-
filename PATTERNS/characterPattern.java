import java.util.*;
public class characterPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int number = 65; 
        int number = 1; //for Flyodd's triangle
        // char ch = 'A'; // or we can implement through characters
        System.out.println("How many lines do you want to print");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                // System.out.print((char)number);
                System.out.print(number + " "); //for Flyodd's triangle
                // System.out.print(ch); //using character
                number++;
                // ch++; // using character
            }
            System.out.println();
        }
        sc.close();

    }
}