import java.util.Arrays;

public class subArrays {

    public static void sub(int arr[]){
        int tsubArray = 0;
        for(int i = 0; i <arr.length;i++){ 
            for(int j = i; j<arr.length; j++){
                System.out.print("[");
                int sum = 0;
                for(int k = i; k<=j;k++){
                    sum += arr[k];
                    System.out.print(arr[k]+" ");
                }
                tsubArray++;
                System.out.print("]"+ " and sum of this subArray is "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Arrays are "+tsubArray);
    }
 
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        sub(number);
    }
}
