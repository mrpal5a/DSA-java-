public class rotatedSortedArray {
    public static int search(int arr[], int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1; //element not found
        }

        //kaam
        int mid = si + (ei-si)/2; // (si+ei)/2

        //case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // mid on line 1
        if(arr[si] <= arr[mid]){
            
            //case a: search on left side of L1
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                //case b: search on right side of L1
                return search(arr, tar, mid+1, ei);
            }
        }else{
            // mid on line 2

            //case c: search on rigth side of L2
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                //case d: search on right side of L2
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // output --> 4
        int tIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tIdx);
    }
}
