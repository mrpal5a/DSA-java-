import java.util.*;
public class QueueReversal {
    public static void queueRev(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            q.add(i);
        }
        queueRev(q);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
