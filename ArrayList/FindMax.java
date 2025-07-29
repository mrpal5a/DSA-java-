import java.util.ArrayList;
public class FindMax {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(12);
        list.add(121);
        list.add(31);
        list.add(45);

        int max = list.get(0); // int max = INTEGER.MIN_VALUE;
        for(int i = 0; i< list.size(); i++){
            max = (max > list.get(i))? max: list.get(i);
            //max = Math.max(max, list.get(i)); 
        }
        System.out.println(max);
    }
}
