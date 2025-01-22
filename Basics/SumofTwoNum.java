import java.util.*; //for importing Scanner and other classes

public class SumofTwoNum {
    public static void main(String args[]){
        //Scanner class for taking input from user
        Scanner sc = new Scanner(System.in);
        // System.out.println(("Enter your first name only"));
        // String input = sc.next(); // next() is for taking single word as a input
        // System.out.println(input);

        // System.out.println("Enter the full sentence as input");
        // String name = sc.nextLine(); //nextLine() for taking sentence as a input
        // System.out.println(name);
        // int a = 5;
        // int b = 10;
        // int sum = a + b;
        // // System.out.println(sum); 
        // System.out.println("Enter the double type value");
        // double output = sc.nextDouble();
        // System.out.println(output);
        // System.out.println("Enter the short type value");
        // short ans = sc.nextShort();
        // System.out.println(ans);
        // System.out.println("Enter the boolean type value");
        // boolean bool = sc.nextBoolean();
        // System.out.println(bool);
        // System.out.println("Enter the LONG type value");
        // long large = sc.nextLong();
        // System.out.println(large);

        //PRODUCT OF TWO NUMBERS
        // System.out.println("Enter the first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // System.out.println("Multiplication of number is :");
        // System.out.println(a*b);
        
        
        //TYPE PROMOTION IN JAVA
        // char a = 'a'; // it will be automatically converted to INTEGER data type and the value of a will be 97
        // short b = 50; //it will automatically will be converted to INTEGER data type from short
        // int sum = a+b;
        // System.out.println(sum);

        //EXAMPLE OF TYPE PROMOTION
        char c = 'd';
        short d = 100;
        double e = 3423.343;
        float f = 23.2f;
        int g = 4435;
        long h = 12423423;
        System.out.print((c + d * e - f /g %h)); // output is 342334.29476888356 means it is automatically converted to DOUBLE data type
        //means whole answer is converted to the LARGEST data type available in question that is DOUBLE
    }
}
