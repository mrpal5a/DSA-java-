import java.util.ArrayList;
public class MultiDimArrLis {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        mainList.add(list2);

        // printing the multi-dimensional arrayListt
        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i); // accessing the multiple lists one by one
            // traversing the each list, that we just retrieved
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // directly printing the Multi-Dimension Array
        System.out.println(mainList);


        // shortcut to assign values to multiple lists
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list3.add(i*1);
            list4.add(i*2);
            list5.add(i*3);
        }

        mainList2.add(list3);
        mainList2.add(list4);
        mainList2.add(list5);
        System.out.println(mainList2); // mainlist2 is a multi-dimensional ArrayList
    }
}
