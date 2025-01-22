import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("This is the simple calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value");
        int first = input.nextInt();
        System.out.println("Enter the operator");
        char operator = input.next().charAt(0);
        System.out.println("Enter the second value");
        int second = input.nextInt();
        switch (operator) {
            case '+': System.out.println("Here is the sum of two numbers " + (first +  second));
                break;
                case '-': System.out.println("Here is the minus of two numbers " + (first -  second));
                break;
                case '*': System.out.println("Here is the multiplication of two numbers " + (first *  second));
                break;
                case '/': System.out.println("Here is the division of two numbers " + (first /  second));
                break;
                case '%': System.out.println("Here is the reminder of two numbers " + (first %  second));
                break;
            default: System.out.println("Please enter the valid operator");
                break;
        }
    }
}
