import java.util.*;
public class Linear_search {
    // public static int search(int arr[], int index){
    //     for(int i = 0; i < arr.length; i++){
    //         if(index == arr[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static int search(String arr[], String index){
        for(int i = 0; i < arr.length; i++){
            if(index.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"samosa", "dosa", "vadapav", "frankie", "momos"};
        System.out.println("Enter the item, you are looking for breakfast");
        String key = sc.next();
        int found = search(menu, key);
        System.out.println(key+" found at " +(found+1)+ " in the list");
        // System.out.println("Enter the key to search ");
        // int key = sc.nextInt();
        // found = search(number, key);
        // if(found == -1){
        //     System.out.println("Element not found");
        // }else{
        //     System.out.println("Element "+key+ " found at " +found+" index");
        // }
        sc.close();
    }
}
