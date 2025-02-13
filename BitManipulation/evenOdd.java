public class evenOdd {
    public static void evenOdd(int n){
        int bitMask = 1; // jis number ke saath operation perform krte hai usko bitMast bola jata hai generally
        // yeh pe hame odd and even find krna hai to 1 ke saath numbers ka Bitwise AND(&) operation perform karenge
        if((n & bitMask) != 0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        evenOdd(n);
    }
}
