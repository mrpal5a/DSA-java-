import java.util.*;
public class starPatter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 4; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}