public class Subsets {
    public static void findSubset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        // YES CHOICE, agar hum character ko add krte hai tab
        findSubset(str, ans + str.charAt(i), i+1); // 
        // NO CHOICE 
        findSubset(str, ans, i+1); // character add ho ya na ho, lekin hume next level pe har baar move krna hai
    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str, "", 0);
    }
}
