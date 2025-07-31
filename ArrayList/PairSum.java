import java.util.ArrayList;

public class PairSum {
    // Find if any pair in a shorted ArrayList has a target sum
    // list = {1,2,3,4,5,6}, target = 5
    public static boolean Pairsum(ArrayList<Integer> list, int target){   //O(n)
        int LeftPointer = 0;
        int RightPointer = list.size()-1;
        while(LeftPointer < RightPointer){
            //case 1: pair sum = targer
            if(list.get(RightPointer) + list.get(LeftPointer) == target){
                return true;
            // case 2: pair sum > target
            }else if(list.get(RightPointer) + list.get(LeftPointer) > target){
                RightPointer--;
            //case 3: pair sum < target
            }else{
                LeftPointer++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(Pairsum(list, 4));
    }
}
