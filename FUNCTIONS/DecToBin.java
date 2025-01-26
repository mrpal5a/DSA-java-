import java.util.*;
public class DecToBin {
    public static void DectoBin(int number){
        String append = "";
        while(number > 0){
            int rem = number % 2; // number ka lastDigit yeh se milega
            number = number / 2; // number ka lastDigit krne ke baad ka number example: 1234 -> 123
            append = append + rem; // rem ko append String ke saath concatenate kr dega
        }
        // int appendInt = Integer.parseInt(append);
        // System.out.println(appendInt);
        String reversed = new StringBuilder(append).reverse().toString(); // yeh append string ko reverse kr dega kyuki  wo ab integer nahi hai and toString() method string mai convert krne mai madad karegi using StringBuilder
        System.out.print(reversed);
    }

    // SHRADDHA MAM METHOD TO CONVERT FROM DECIMAL TO BINARY

    public static void dectobin(int n){
        int power = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, power));
            n = n / 2;
            power++;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary value to find Decimal ");
        int number = sc.nextInt();
        // DectoBin(number);
        dectobin(number);
        sc.close();
    }
}
