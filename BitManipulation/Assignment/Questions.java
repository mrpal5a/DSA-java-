package Assignment;


public class Questions {

    //Question 2 :Swap two numbers without using any third variable.
    public static void swap(int a, int b){
        System.out.println("Before swapping: a = "+a+" and b = " +b);
        (a) ^= (b);
        (b) ^= (a);
        (a) ^= (b);
        System.out.println("After swapping: a = "+a+" and b = " +b);
    }
    //Question 3 :Add 1 to an integer using Bit Manipulation
    //(Hint: try using Bitwise NOT Operator)
    public static int addOne(int num){
        int mask = 1;  // We start with 1 (0001)
        
        while ( (num & mask) == 1) {  // While the bitwise AND is 1, there is a carry
            num = num ^ mask; // Flip the current bit
            mask <<= 1;       // Move to the next bit (carry forward)
        }

        num = num ^ mask;  // Finally, flip the first 0-bit we find
        return num;
    }
    public static void main(String args[]){
        //Question 1:What is the value of x^x for any valueof x?
        int x = 5;
        System.out.println(x^x); // 0
        swap(5, 7);
        System.out.println(addOne(5));
        int n = 6;
        System.out.println(-~n);// 7 this directly adds 1 to the number
        System.out.println(~6);
    }
}
