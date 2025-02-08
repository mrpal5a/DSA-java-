public class Bubble {
    public static void sort(int arr[]){
        int n = arr.length;
        boolean swapped; // this variable is for checking if array is already sorted
        for(int i = 0; i < n-1; i++){
            swapped = false; // initially it is false
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true; // if swapping happens, means array is not sorted. so we will swap
                }
            }
            if(swapped == false){ //if swapping doesn't happens, means swapped variable remains false, means array is already sorted
                break; // so it will break out of loop. as array is already sorted
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,9,11,6,15,8};
        // int arr[] = {1,2,3,4,5};
        sort(arr); // O(n2)
    }    
}
