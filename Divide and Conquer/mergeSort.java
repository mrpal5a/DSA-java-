public class mergeSort{
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;  // (si+ei)/2
        mSort(arr, si, mid); // left part
        mSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei); // dono part ko merge karenge
        
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1]; // temp arr to store the values
        int i = si; // left part iterator
        int j = mid + 1; // right part iterator
        int k = 0; // temp arr iterator

        // swapping the elements
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }

        // leftover elements of sorted array
        //leftover elements from left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //leftover elements from right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copying the elements from temp array to original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

        

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8, -3};
        mSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}