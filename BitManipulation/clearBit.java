public class clearBit {
    public static int CLEARithBit(int n , int i){
        int bitMask = ~(1<<i); // complement of (1<<i) full logic in notebook
        
        return (n & bitMask);

    }
    public static void main(String[] args) {
        int n = 10; // 00001010
        int i = 1;
        System.out.println(CLEARithBit(n, i)); // 00001000
    }
}
