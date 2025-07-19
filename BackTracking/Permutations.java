public class Permutations {

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // actual kaam  O(n * n) time complexity
        for(int i = 0; i < str.length(); i++){
            // getting the current character
            char curr = str.charAt(i);

            // before adding the current character to the answer, first remove it from the original string
            // how to that
            //for example, if we want to remove "c" from "abcde" ==> "ab" + "de"
            //so, we will use this logic by using substring function of string
            String Newstr = str.substring(0, i) + str.substring(i+1); // if we don't provide ending index, then it is by default n-1
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, "");
    }
}
