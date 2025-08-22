import java.util.*;
public class QueueUsingJCF {
   
    public static void main(String[] args) {
        // QueueUsingLL q = new QueueUsingLL();
        // Queue<Integer> q = new LinkedList<>(); 
        Queue<Integer> q = new ArrayDeque<>();
        //Queue 1 interface hai, iske liye uska apna koi object nahi ban sakta isiliye hum LL ke use karenge uska object banane ke liye. Queue ka object 2 tarike se bana sakte hai: 1) LinkedList 2) ArrayDeque
        q.add(1); //O(1)
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){ //O(1)
            System.out.println(q.peek());
            q.remove(); //O(1)
        }
    }
}
