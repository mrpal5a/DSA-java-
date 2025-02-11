public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); //O(26) kyuki 26 times for loop run hui
            // wahi agar yeh kam hum log string ka use krte to += append, wo sab use krke krte or time complexity hoti
            //O(n^2) >>>>>>>> O(n);
            // isiliye hum StringBuilder use karenge
        }
        System.out.println(sb.length());
    }
}
