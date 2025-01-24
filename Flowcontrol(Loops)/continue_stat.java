import java.util.*;
public class continue_stat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();
        do{
            System.out.print("Enter the number you want to display: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue; // jab number 10 se divide ho rha hoga to yeh usko print nahi karega or phir se input mangega or yeh program infinite loop mai chalte rahega mtlb kabhi end nahi hoga
            }
            System.out.println(n);
        }while(true);
    }
}
