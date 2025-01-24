import java.util.*;
public class fun_Overloading_param{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int add = sum(5,4,8);
        System.out.print("Sum is " +add);
        sc.close();
    }
}