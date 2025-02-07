//steps to solve trapped Water  Problem
//calculate left max array
//calculate right max array

//loop
//trappedwater = 0
//waterlevel = min(leftMax[i], RightMax[i]);
//trappedwater += (waterlevel - height[i])*width;
public class TrappedWater {
    public static int water(int height[], int width){// O(n) // time complexity = number of bars OR number of element in height array
        int n = height.length;
        //calculate left max boundary - array
        int leftMaxBoundary[] = new int[n];
        //assigning element to left max boundary array
        leftMaxBoundary[0] = height[0]; // for left max boundary, first element will be itself it's maximum element
        for(int i = 1;i < n;i++){
            //compare current and previous element and assign which is bigger
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }
        //calculate right max boundary - array
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n - 1] = height[n - 1]; //for right max boundary, last element will be itself it's maximum element
        //assigning element to right max boundary array
        for(int i = n-2; i >= 0; i-- ){ // starting loop from backward
            //compare current and next element and assign the bigger value
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
        // loop
        int TrappedWater = 0;
        for(int i = 0; i < n;i++){
            //calculate waterLevel = min(leftMax[i], rightMax[i])
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            //TrappedWater = (waterLevel - height[i])*width
            TrappedWater += (waterLevel - height[i])*width;
        }  
        return TrappedWater;
    }
    public static void main(String[] args) {
        int width = 1;
        int height[]= {4,2,0,6,3,2,5};
        int TrappedWater = water(height,width);
        System.out.println("Water trapped in these heights is "+TrappedWater);
    }

}
