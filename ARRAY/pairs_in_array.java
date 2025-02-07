public class pairs_in_array {
    public static void pairs(int arr[]){
        int tpair = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1 ; j < arr.length; j++){
                System.out.print("(" +curr+","+arr[j]+")");
                tpair++;
            }
            System.out.println();
        }
        System.out.println("Total number of pair is "+tpair);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        pairs(number);
    }
}
