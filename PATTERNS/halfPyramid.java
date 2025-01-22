import java.util.*;
public class halfPyramid{
    public static void main(String args[]){
        // int n = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print the pattern");
        int n = sc.nextInt();
        for(int line = 1; line <= n ; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}