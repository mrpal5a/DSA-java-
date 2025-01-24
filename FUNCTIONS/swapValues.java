import java.util.*;
public class swapValues{
    // swap function
    public static void swapFunction(int a, int b){ 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping");
        System.out.println("Value of a is " + a);
        System.out.println("value of b is " +b); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b ");
        int b = sc.nextInt();
        swapFunction(a, b);
        sc.close();
    }
}