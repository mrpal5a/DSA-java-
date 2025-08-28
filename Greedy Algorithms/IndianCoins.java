import java.util.*;

//Q: We are given an infinite supply of denominations[1,2,5,10,20,50,100,500,2000]. Fint min no. of coins/notes to make change for a amoount V.
public class IndianCoins {
    public static void coins(int amount){
        List<Integer> result = new ArrayList<>(); // for storing the coins
        Integer arr[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            while(amount >= arr[i]){
                amount -= arr[i];
                result.add(arr[i]);
            }
        }
        System.out.println("Number of coins used " + result.size());
        System.out.println(result);
    }
    public static void main(String[] args) {
        coins(2758);
    }
}
