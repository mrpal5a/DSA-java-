import java.util.*;

//Q: Given two arrays A and B of equal length n.Pair each element of array A to an element in array B, such that there absolute differences of all the pair is minimum

public class MinAbsDiffSum {
    public static int AbsDiff(int A[], int B[]){
        int AbsSum = 0;
        Arrays.sort(A); // 1,4,5
        Arrays.sort(B); // 1,2,3
        for(int i = 0; i < A.length; i++){
            AbsSum += Math.abs(A[i] - B[i]); // |A[i] - B[i]|
        }
        return AbsSum;
    }
    public static void main(String[] args) {
        int A[] = {1,5,4};
        int B[] = {2,1,3};
        System.out.println(AbsDiff(A, B));
    }
}
 