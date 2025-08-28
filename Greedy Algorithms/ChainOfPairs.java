import java.util.*;

//Q: You are given n pairs of number. In every pair first number is always smaller then second number.A pair (a,b) can after pair (c,d) if b < c. find the longest chain which can be formed from the given set
public class ChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = { 
            {5, 24},
            {39, 60},
            {5,28},
            {27,40},
            {50,90}
        };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sorting the array on basis of second column
        int chainLen = 1;
        int endvalue = pairs[0][1]; // last selected pair end // last chain end
        for(int i = 0; i < pairs.length; i++){
            if(endvalue < pairs[i][0]){
                chainLen += 1;
                endvalue = pairs[i][1];
            }
        }
        System.out.println("Max length of chain is "+chainLen);
    }
}
