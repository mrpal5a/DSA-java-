import java.util.Scanner;
public class weekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will print weekdays according to the number");
       int day = sc.nextInt(); // it will take the input and store it in the 'day' variable
       switch (day) {
        case 1: // here 1 will be compared with day variable if it matches then it will exact this case otherwise it will compare with different cases, it will execute the case where it matches if not matches then it will execute default case
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
       
        default: System.out.println("Please enter the valid day number");
            break;
       }
       sc.close();
    }
}
