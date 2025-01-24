import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        System.out.println("This program will print whether the year is leap or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
            else{
                System.out.println(year + " is not a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
