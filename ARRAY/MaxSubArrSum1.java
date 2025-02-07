public class MaxSubArrSum1 {
    // Brute Force method
    public static void MaxsubSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i <arr.length;i++){ 
            for(int j = i; j<arr.length; j++){
                currSum = 0;
                for(int k = i; k<=j;k++){
                    currSum += arr[k];
                }
                System.out.print(currSum+" ");
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                if(currSum < minSum){
                    minSum = currSum;
                }
            }
        }
        System.out.println();
        System.out.println(maxSum);
        System.out.println(minSum);
    }
    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        MaxsubSum(number);
    }
}


