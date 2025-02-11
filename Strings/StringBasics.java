import java.util.*;
public class StringBasics {
    public static void printingString(String str){
        for(int i = 0;i<str.length();i++){ // loop through each character of string
            System.out.println(str.charAt(i)+" "); // it will print each character of string
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // declaring string
        String str = "Anshu"; // first method
        String str2 = new String("Pal"); // second method
        System.out.println(str + " " +str2); // string concatenation
        String firstName = "Anshu";
        String lastName = "Pal";
        String fullName = firstName + " " +lastName;

        // string length
        fullName.length(); // 9
        System.out.println(fullName.length());


        //taking String as input from user
        // String singleword = sc.next(); // it can only take 1 word as input and will discard other inputs
        // String sentence = sc.nextLine(); // it can take whole sentence as input
        // System.out.println(singleword);
        // System.out.println(sentence);


        // printing all characters of input
        // printingString(sentence);



        //string comparison
        String s1 = "Tony";
        String s2 = "Tony"; // agar same string pehle se memory mai hai to wo usi ko point karega
        String s3 = new String("Tony"); // new keyword ke saath create krte hai to wo new memory location pe jata hai

        String ans = s1 == s2 ? "true" : "false"; // true, memory mai pehle se Tony store tha to s2 ne usi ki taraf point kr diya, ab dono 1 hi location pe point kr rahe hai to wo dono same hai isiliye true
        String ans2 = s1 == s3? "true":"false"; // false because they are referring to different memory location, 
        System.out.println(ans);
        System.out.println(ans2);


        // equals method for string comparison
        //EQUALS method boolean value return krta hai
        // yeh inbuilt equals method khali value compare krta hai, memory location ko nahi dekhta hai
        //isiliye dono cases mai true return kiya 

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
    }
}
