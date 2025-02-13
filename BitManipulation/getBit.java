public class getBit {
    /*pehle hum 1 ko left shift kr denge i se
     *example; i = 2;
     00000001 << 2 --> 00000100     ab hum iske saath number ka AND(&) operation perform krwa denge or agar answer 0 aya to mtlb ith bit 0 hai or agar 0 ke alawa kuchh bhi ata hai mtlb non-zero number to phir hamara ith bit 1
    int n = 15;
    n == 00001111 & 00000100 --> 00000100
    answer aya 4 mtlb non-zero to ith bit hai hamari 1 

     */

    // this function will return ith bit of number
    public static int GETithBIT(int n, int i){
        int bitMask = (1<<i); // 1 ko hum log left shift kr rahe hai
        if((n & bitMask) == 0){ // & operation perform and agar answer 0 ata hai mtlb ith bit 0 or non-zero ata hai mtlb ith bit 1
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        System.out.println(GETithBIT(n, i));
    }
}
