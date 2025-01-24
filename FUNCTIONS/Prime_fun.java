import java.util.*;
public class Prime_fun {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
            // isPrime = true; 
            return true; // we can directly retrun true so that below code will not run for this case means it will save our time
        }else{
            // for(int i = 2; i <= n - 1; i++){ // simple prime
            for(int i = 2; i <= Math.sqrt(n); i++){ // optimized prime 
                if(n % i == 0){
                    // isPrime = false;
                    // break;
                    return false; // instead of above 2 lines we can directly return from here by writing return statement, so it will not check for remaining cases
                }
            }
        }
        // return isPrime;
        return true; // because we are not using isPrime variable anymore
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for prime ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
        sc.close();
    }
}
