import java.util.Stack;

public class NextGreater {
    public static void NextGreaterNumber(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){ // backward loop
            while(!s.isEmpty() && arr[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
         for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,8,15,2,8,3};
        // int nextGreater[] = new int[arr.length];
        NextGreaterNumber(arr);
       
    }
}
