public class Lexicographic_largest_string {
    // strings ke har ek character ko compare krte hai, jiska character bada hoga wo string badi
    // example: apple and banana -> banana is large because b > a. similarly if we compare aaabcad and aaabcae then aaabcae > aaabcad because e > d
    // here we are not comparing length of string
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango","banana"};
        String largest = fruits[0]; // assume first element is largest
        for(int i = 1;i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){ // compare to function value return krta hai mtlb 0
                largest = fruits[i];                            // str1.compareTo(str2)
                                                                    // 0 if both strings are same
                                                                    // negative if str2 > str1
                                                                    // positive if str1> str2

            }
        }
        System.out.println(largest); // mango as m is larger than a and b
    }
}
