public class allOpeartionsBitManipulation {
    public static int SETithBit(int n, int i){
        int bitMask = (1<<i);
        return n | bitMask;
    }

    public static int CLEARithBit(int n, int i){
        int bitMask = ~(1<<i); // complement of (1<<i) full logic in notebook 
        return (n & bitMask);
    }
    public static int UPDATEithBit(int n, int i, int newBit){
        if(newBit == 0){
            return CLEARithBit(n, i);
        }else{
            return SETithBit(n, i);
        }
    }
    public static int CLEARlastIbits(int n, int i){
        int bitMask = ((-1)<<i); // 11111100
        return n&bitMask; //00001111 & 11111100 ---> 00001100 == 12
    }
    public static int CLEARrangeofIbits(int n, int i, int j){ 
        int a = ~0 << (j+1); // 11111000
        int b = (1<<i) - 1; // 00000001
        int bitMask = a | b; // 11111001
        return n & bitMask; // 00001111 & 11111001 ---> 00001001
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0; // agar n, 2 ki power wala hoga to true return karega warna false
    }

    //Question: count SET bits in a number
    //mtlb kitne 1's hai number mai wo count karenge
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){ // jab tak number 0 se bada kyuki number jab 0 ho jayega tu uske andar SET bits ek bhi nahi hongi
            if((n & 1) == 1){ // kisi bhi number ka & (AND) operation perform karenge 1 ke saath to hume LSB bit mil jaati hai, or agar wo LSB 1 ke equal hai to count++ krdo
                count++;
            }
            n = n >> 1; // number ko 1 se right shift krdo mtlb 0101 hai to 0010 ho jayea ab LSB 0 ho gayi or phir number right shift hote hote last mai wo 0 ho jayega or hum log while loop se exit ho jayenge
        }
        return count;
    }

// FAST EXPLONENTIATION
    public static double exponentiation(int n, int pow){
        int ans = 1; // ans ko initialize kiye 1 se
        while(pow > 0){ // jab tak power 0 > se badi hai tab tak loop ke andar kyuki agar pow 0 ho jayegi to phir kisi bhi number ka multiplication 1 ke saath same hi hota hai
            if( (pow & 1) == 0){ // agar power 0 mtlb LSB 0 hai to ans = ans * 1, mtlb ans ko n se nahi 1 se multitply karo
                ans *= 1;
                n = n*n; // number ka square nikalo
            }else{
                ans = n* ans; // agar LSB 1 hai to ans ko previous n ki value se multiply karo
                n = n*n; // phir se n square kardo 
            }
            pow = pow >> 1; // pow ko rigth shift kar rahe hai 1 se, taaki LSB milti rahe or jab yeh 0 ho jayegi tab while loop se exit ho jayenge
        }
        return ans;
    }

    public static void main(String args[]){
        // System.out.println(UPDATEithBit(10,2,1));            // 14 
        //                                                     // 10 -> 00001010
        //                                                     // i = 2 
        //                                                     //newBit = 1
        //                                                     //answer = 00001110 mtlb 2 index pe 1 set kr diya answer ayega 14
        // System.out.println(CLEARlastIbits(15, 2)); // 
        // System.out.println(~0);
        // System.out.println(CLEARrangeofIbits(15, 1, 2)); // 15 --> 00001111 & 00001001 so, answer = 00001001 // detail explanation in notebook
        // System.out.println(isPowerOfTwo(16));
        // System.out.println(countSetBits(7)); //3
        System.out.println(exponentiation(3, 5)); // 243
    }
}
