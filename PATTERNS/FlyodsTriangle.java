import java.util.*;
public class FlyodsTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want to print");
        // int number = 1;
        int number = sc.nextInt();
        for(int line = 1; line <= 4; line++){
            for(int num = 1; num <= line; num++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}