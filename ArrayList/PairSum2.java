import java.util.ArrayList;

public class PairSum2 {
    // Find if any pair in a SORTED & ROTATED ArrayList has a target sum
    // list = {11,15,6,8,9,10}, target = 16
    public static boolean pairsum(ArrayList<Integer> list, int target){  // O(n)
        int pivot = 0;
        int n = list.size();
        for(int i = 1; i < n; i++){
            if(list.get(i-1) > list.get(i)){ // agar previous value next value se badi ho to wo pivot point hai sorted and rotated array ka
                pivot = i;
                break;
            }
        }
        int LeftPointer = pivot+1; // smallest
        int RightPointer = pivot; // largest
        while(LeftPointer != RightPointer){
            //case 1
            if(list.get(RightPointer) + list.get(LeftPointer) == target){
                return true;
            } 
            //case 2
            else if(list.get(RightPointer) + list.get(LeftPointer) > target){
                RightPointer = (n + RightPointer -1)%n; // sorted and rotated array ke liye rightpointer ko decrease krne ka tarika, taaki START pe pahuch jaye to uske baas pointer direct last index pe chale jaye
            }
            //case 3
            else{
                LeftPointer = (LeftPointer + 1) %n; // same, sorted and rotated array ke liye leftpointer ko increase krne ka tarike, taaki  END pe pahuch jaye to wapas starting se start krde mtln 0 index se
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum(list, 16));
    }
}
