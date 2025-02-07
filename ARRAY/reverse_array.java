public class reverse_array {
    public static void reverse(int arr[]){
        int last = arr.length - 1;
        for(int i = 0; i < last; i++){
            if(i > last/2){
                for(int j = 0; j <= last; j++){
                    System.out.print(arr[j]+ " ");
                }
            }else{
               int temp = arr[i];
               arr[i] = arr[last - i];
               arr[last - i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        reverse(number);
    }
}
