import java.util.ArrayList;
import java.util.Collections;
public class Swap {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){ // same as int arr[]
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(121);
        list.add(41);
        list.add(20);

        //sorting the ArrayList using inbuilt methods
        Collections.sort(list); //Ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); // Descending order
        

        int idx = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx, idx2);
        System.out.println(list);
    }
}
