public class MaxSubArrSum2 {
    // Prefix sum method
    public static void sum(int arr[]){
        int prefix[] = new int[arr.length]; // creating a empty prefix array
        prefix[0] = arr[0]; // as the sum of first element will be itself, so first element will always be same
        for(int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i]; // prefixArr[2] = prefixArr[1](previous sum of all elements) + Arr[2](current element)
            //sum till index = sum till previous index + current index 
        }
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length; i++){
            int start = i; //first element of subarray for which we are finding sum
           for(int j = i; j <arr.length; j++){
            int end = j; // last element of subarray for which are finding sum
            currSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start - 1]; // now if start is 0, then it will through error, so we are using ternary operator or If-else block
            if(maxSum < currSum){
                maxSum = currSum;
            }
            if(minSum > currSum){
                minSum = currSum;
            }
           }
        }
        System.out.println(minSum);
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        sum(number);
    }
}
