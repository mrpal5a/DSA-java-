public class setBit {
    public static void SETithBit(int n, int i){
        // ith bit ko 1 banana hai
    /* same logic jis bit ko set krna hai usko 1 se left shift kr denge mtlb (1<<i)
     * or number ka (1<<i) se saath OR (|) operation perform kr denge
     */
        int bitMask = (1<<i);
        n = n | bitMask;
        System.out.println(n); // 7 
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        SETithBit(n, i);
    }
}
