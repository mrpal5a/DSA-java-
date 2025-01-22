//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class practiceQ2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers do you have");
        int time = sc.nextInt();
        int odd = 0;
        int even = 0;
        for(int i = 0; i < time; i++){
            System.out.print("Enter the  " +(i+1) +" integer ");
            int digit = sc.nextInt();
            if(digit % 2 == 0){
                even += digit;
            }
            else{
                odd += digit;
            }
        }
        System.out.println("Sum of all odd integers is: " +odd);
        System.out.println("Sumg of all even integers is: " +even);
    }
}
