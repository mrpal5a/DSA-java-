import java.util.*;

public class FK {
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int val[] = {60, 100, 120};
        int W = 50;

        double ratio[][] = new double[val.length][2]; // [index, ratio]

        // Step 1: Store index and ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Step 2: Sort by ratio (ascending)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // Step 3: Pick items from highest ratio to lowest (backward loop)
        int capacity = W;
        double finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) { // full item
                capacity -= weight[idx];
                finalValue += val[idx];
            } else { // fractional item
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum value in Knapsack = " + finalValue);
    }
}