import java.util.*;

public class PrimeInRange {
    public static boolean isPrime(int n){ // this function checks the number for Prime or not, if it is prime then returns true otherwise returns false
        if(n == 2){
            return true;
        }
        else{
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i = 1; i <= n; i++){
            boolean prime = isPrime(i); // calling isPrime() function to check each number for Prime or Not
            // NOTICE, while calling isPrime() function we are giving each and every number as input, here we are giving i as input
            if(prime){ // if number is prime then it will print the number
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want to find the prime ");
        int n = sc.nextInt();
        PrimeRange(n);
        sc.close();
    }
}
