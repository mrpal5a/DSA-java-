import java.util.Stack;
public class MaxAreaHistogram {
    public static int maxArea(int arr[]){
        int n = arr.length;
        int maxArea = 0;
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        // step 1: Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;    // -1 hum next greater mai krte the
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // step 2: Next Smaller Left
        s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1; 
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // step 3: Calculate area, width = j - i - 1 => nsr[i] - nsl[i] - 1
        for(int i = 0; i < n; i++){
            int currArea = arr[i] * (nsr[i] - nsl[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,4};
        System.out.println(maxArea(arr));
    }
}
