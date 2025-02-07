
public class largest_el{

    public static int large(int arr[]){
        int large = Integer.MIN_VALUE; // it is the minimum value in java // -infinity
        int small = Integer.MAX_VALUE; // it is the maximum value in java //+infinity
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,15,7,4,3,0,7,10,4};
        int lar = large(arr);
        System.out.println(lar);
    }
}