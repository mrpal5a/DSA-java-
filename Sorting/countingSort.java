public class countingSort {
    public static void sort(int arr[]){
        // finding largest number in array, so that we can create a new count array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];

        //calculating the frequency of each number
        for(int i = 0; i < arr.length; i++){
                count[arr[i]]++; //frequency
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--; // reducing the frequency, as the the element is placed in the array
            }
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        sort(arr); // O(n + range) means O(largest number in the array)
        print(arr);
    }
}
