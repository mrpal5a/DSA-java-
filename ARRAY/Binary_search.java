public class Binary_search {
    public static int search(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                start = mid;
            }else{
                end = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,3,5,7,9,11,13,15,17};
        int key = 7;
        int found = search(number, key);
        if(found == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at index "+found);
        }
    }
}
