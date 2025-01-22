import java.util.*;
public class prime_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for prime :");
        int n = sc.nextInt();
        if(n == 2 ){
            System.out.println("2 is prime");
        }else{
            boolean is_prime = true;
            // for(int i = 2; i < n; i++){ //it will check the number till number - 1, means if number is 12 then it will check till 11
            for(int i = 2; i < Math.sqrt(n); i++){ // for optimization or time efficiency. it will only check the prime number to the half of the prime number means if number is 12 then it will only check till 6
                if(n % i == 0){ // this means n is multiple of i (means n is divisible by i so it is not a prime number)
                    is_prime = false;
                }
            }
            if(is_prime == true){
                System.out.println(n + " is prime");
            }else{
                System.out.println(n + " is not prime");
            }
        }
        
    }
}
