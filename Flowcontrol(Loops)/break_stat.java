import java.util.*;
public class break_stat {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        // int n = 0;
        int m = 100000;
        for(int i = 0; i < m; i++){
            System.out.print("Enter Your Number :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }
    }
}
