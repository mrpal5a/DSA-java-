// Stack implementation using Java Collection Framework
import java.util.Stack;
public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
//implemented very easily because all these methods already exists in JCF