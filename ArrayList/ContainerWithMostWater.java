import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
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

        int max = 0;
        // brute force approach O(n^2)
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int L1 = height.get(i);
                int L2 = height.get(j);
                int minHeight = Math.min(L1, L2);
                int width = j - i;
                max = Math.max(max, minHeight*width);
            }
        }
        System.out.println(max);

        // in this approach we will only make BOX with the bar having maximum height
        // this is was my approach and I had realised it is not valid for all conditions   // O(n);
        // finding the maximum height bar
        int maxHeigth = height.get(0);
        int maxIdx = 0;
        for(int i = 0; i< height.size(); i++){
            if(maxHeigth < height.get(i)){
                maxHeigth = height.get(i);
                maxIdx = i;
            }
        }
        // System.out.println(maxIdx);
        // System.out.println(maxHeigth); //8
        int maxWater = 0;
        for(int i = 0; i < height.size(); i++){
            int L2 = height.get(i);
            int width = Math.abs(maxIdx-i);
            maxWater = Math.max(maxWater, width * L2);
        }
        System.out.println(maxWater);


        // TWO POINTERS approach O(n)
        int mostWater = 0;
        int LP = 0, RP = height.size()-1;
        for(int i = 0; i < height.size(); i++){
            int L1 = height.get(LP);
            int L2 = height.get(RP);
            int width = Math.abs(LP - RP);
            int ht = Math.min(L1, L2);
            mostWater = Math.max(mostWater, width*ht);
            if(height.get(LP) > height.get(RP) && LP < height.size() && RP >=0){
                RP--;
            }else{
                LP++;
            }
        }
        System.out.println(mostWater);
    }
}
