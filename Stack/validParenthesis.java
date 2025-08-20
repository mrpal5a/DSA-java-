import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // opening bracket condition
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                //closing bracket condition
                if(s.isEmpty()){ // if no element in the stack
                    return false;
                }else{
                    if((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']') ){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "(([]{})){}";
        System.out.println(isValid(str));
    }
}
