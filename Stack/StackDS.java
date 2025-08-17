import java.util.ArrayList;

// Stack Data Structure using ArrayList
public class StackDS {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public  boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public  void push(int data){
            list.add(data);
        }

        // pop
        public  int pop(){
            if(list.size() == 0) {
                System.out.println("Stack is empty!");
                return -1; // or throw exception
            }
            int top = list.get(list.size() - 1); // top of stack
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek(){
            if(list.size() == 0) {
                System.out.println("Stack is empty!");
                return -1; // or throw exception
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
