public class MaxSubArrSum3 {
    public static void kadanes(int number[]){ 
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i< number.length; i++){
            currSum = currSum + number[i];
            if(currSum < 0){ //agar currentSum negative hai to usko zero krdo
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
            // agar array ke saare element negative hai to niche wale code se un mai se jo largest element hai wo aa jayega
            if(maxSum == 0){
                maxSum = number[0];
                for(int j = 1; j< number.length; j++){
                    if(maxSum < number[j]){
                        maxSum = number[j];
                    }
                }
            }
        }
        System.out.println("max sum of sub Array is "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3}; // agar array mai saare element negative hai to kadane algorithm work nahi karega or zero return karega uss case mai hame alag se for loop chalani padegi or maximum element find krna padega array mai se
        kadanes(number);
    }
}
