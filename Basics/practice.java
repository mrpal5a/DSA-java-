import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter cost of Pencil");
        // float pencil = sc.nextFloat();
        // System.out.println("Enter cost of Pen");
        // float pen = sc.nextFloat();
        // System.out.println("Enter cost of Marker");
        // float marker = sc.nextFloat();
        // float total = pencil + pen + marker;
        // System.out.println("Your total cost is: " + (float)(total *(1 + 18/100)) + " including GST");
        // // float $ = sc.nextFloat();
        // int $ = 24;
        // System.out.println("This is the value of $ sign " + $);


        //CHECKS WHETHER THE NUMBER IS POSITIVE OR NEGATIVE

        // System.out.println("Enter the number");
        // int number = sc.nextInt();
        // String type = (number >= 0)?"Positive": "Negative";
        // System.out.println(type);


        //CHECKS WHETHER TEMPERATURE IS MORE OR LESS

        System.out.println("Enter the temperature value in fehrenheit");
        float temp = sc.nextFloat();
        String more = "You have fever";
        String less = "You don't have fever";
        String ans = (temp > 100)? more: less;
        System.out.println(ans);
        sc.close();
    }
}
