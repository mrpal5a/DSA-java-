import java.util.ArrayList;

public class MostWater {
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //Two Pointer Approach
        int maxWater = 0;
        int LeftPointer = 0, RightPointer = height.size()-1;
        while(RightPointer > LeftPointer){
            int LeftSide = height.get(LeftPointer);
            int RightSide = height.get(RightPointer);
            int minHeight = Math.min(LeftSide, RightSide);
            int width = RightPointer - LeftPointer;
            maxWater = Math.max(maxWater, width * minHeight);
            if(LeftPointer > RightPointer){
                RightPointer--;
            }else{
                LeftPointer++;
            }
        }
        System.out.println(maxWater);
    }
}
