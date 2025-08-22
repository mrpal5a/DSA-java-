import java.util.*;

//Q: Interleave 2 Halves of a Queue(even length) // time complexitt = O(n) & space complexity = O(n), because of one extra queue is created
//input -> 1,2,3,4,5,6,7,8,9,10
//output -> 1,6,2,7,3,8,4,9,5,10
public class QueueQ5 { 
    public static void interleave(Queue<Integer> q){
        int n = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i < n/2; i++){ // adding starting half elements in temp queue
            q2.add(q.remove());
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<= 10; i++){
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
