package Assignment;
import java.util.Arrays;
import java.util.Scanner;

//Question1:Count how many times lower case vowels occurred in a String entered by the user
public class Q1 {
    public static int vowelCount(String str){
        int count = 0;
        for(int i = 0; i <str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    // STRINGS QUESTIONS
    // Question 4 :Determine if 2 Strings are anagrams of each other.
    // What are anagrams?
    //If two strings contain the same characters but in a different order,they can be said to be anagrams.Consider race and care.In this case, race's characters can be formed into a care,or care's characters can be formed into race.Below is a java program to check if two strings are anagrams or not

    public static void anagrams(String str1,String str2){
        if(str1.length() == str2.length()){

            // we are converting both the strings to lowercase so that we don't have to compare for other
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            // converting strings into character
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();
            
            //sorting both the arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            boolean result = Arrays.equals(str1charArray, str2charArray);// it will return true if both the arrays are same
            
            if(result){
                System.out.println(str1+" and "+str2+" both the strings are anagrams" );
            }else{
                System.out.println(str1+" and "+str2+" both the strings are not  anagrams" );
                
            }
            
        }else{
            System.out.println(str1+" and "+str2+" both the strings are not anagrams" );

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        //String replace method
        String str1="ApnaCollege".replace("l","");
        System.out.println(str1); // ApnaCoege
        // String str = sc.nextLine();
        // System.out.println(vowelCount(str));
        String str3 = "heart";
        String str2 = "earth";
        anagrams(str3, str2);
    }
}
