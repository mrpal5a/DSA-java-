import java.util.*;

//Queue using 2 stacks, we are using Java Collection Framework
public class QueueQ2 {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    //add
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push((s2.pop()));
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String[] args) {
        QueueQ2 q = new QueueQ2();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
