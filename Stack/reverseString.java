import java.util.*;
// reverse the string using stack
public class reverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        // storing the resultant string in new empty string using StringBuilder
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return  result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverse(str);
        System.out.println(result);
    }
}
