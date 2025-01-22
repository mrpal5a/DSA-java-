import java.util.*;
public class operators {
    public static void main(String args[]){
        System.out.println("This is an example of Ternary operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for ODD or EVEN ");
        int input = sc.nextInt();
        String ODDorEVEN = (input % 2 == 0)?"Even":"Odd";
        System.out.println(ODDorEVEN);
        
    }
}
