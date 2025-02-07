import java.util.*;
public class arrayBasics{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){ // it will loop through each element of marks array
            marks[i] = marks[i] + 1; // updating the value of each element
        }
    }
    public  static void main(String args[]){
        //System.out.println("This file is for testing ARRAY folder on github");
        // Scanner sc = new Scanner(System.in);
        // int marks[] = new int[50];
        // System.out.println(marks.length); //arrayName.length
        // int num[] = {1,2,3};
        // marks[0] = sc.nextInt(); // taking input from user for first element
        // System.out.println(num[1]);
        // marks[0] = marks[0] + 1; //correcting the input or value of element
        // System.out.println(marks[0]); // printing the value
        // sc.close();

        int marks[] = {95,96,99};
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}