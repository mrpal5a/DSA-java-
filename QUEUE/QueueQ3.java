import java.util.*;

//Q: Find first non-repeating character in stream of characters. 
// when there will be stream, then it act as a hint to solve the problem using QUEUE

public class QueueQ3 {
    public static void printFirstNonRepeating(String str){
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>(); //Queue is an interface, it does not have its objects
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            q.add(ch); // adding the character in the queue
            freq[ch-'a']++; //increasing the frequency of that particular character
            // ch-'a' will give the index of that particular character  in array and then increase the freq
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){ // checking the frequency of that particular character, if freq > 1, then remove that character from queue
                q.remove();
            }
            if(q.isEmpty()){ // print -1
                System.out.print(-1+ " ");
            }else{
                System.out.print(q.peek()+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String str = "aabccxb";
        String str = "aabxddxb";
        printFirstNonRepeating(str);
    }
}
