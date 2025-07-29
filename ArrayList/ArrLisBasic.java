import java.util.ArrayList;

public class ArrLisBasic {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        // Add operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,7);
        System.out.println(list);

        //Get Operation
        int element = list.get(2); //O(1)
        System.out.println(element);

        // Remove/Delete Operation
        list.remove(2);  // passing the index as input to delete  // O(n)
        System.out.println(list);

        //Set Element operation
        list.set(2, 10); // list.set(index, newValue) //O(n)
        System.out.println(list);

        //isContain
        System.out.println(list.contains(10)); //O(n)
        System.out.println(list.contains(7));

        //list.size(); // it is a method
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)  +" ");
        }
        System.out.println();

        arr.add(1); //O(1)
        arr.add(2);
        arr.add(3);
        arr.add(4);
        // arr.remove(3);

        // printing Reverse ArrayList
        for(int i = arr.size()-1; i >= 0; i--){
            System.out.print(arr.get(i) + " ");
        }

    }
}
