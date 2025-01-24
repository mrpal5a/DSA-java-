import java.util.*;
public class Zero_One_triangle_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many  lines do you want to print");
        // int number = 1;
        int number = sc.nextInt();
        for(int line = 1; line <= 5; line++){
            if(line % 2== 0){
                for(int num = 1; num <= line; num++){
                    if(number %2 == 0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                    number++;
                }
                System.out.println();
            }
            else{
                for(int num = 1; num <= line; num++){
                    if(number %2 != 0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                    number++;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}