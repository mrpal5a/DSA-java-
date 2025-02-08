public class SelectionSort {
    public static void sort(int arr[]){
        for(int i = 0; i<= arr.length - 2;i++){
            int smallest = i;
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sort(arr); //O(n2)
    }
}
