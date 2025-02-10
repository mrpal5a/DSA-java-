public class palindrome {
    public static boolean palindromeCheck(String str){
        int n = str.length()-1;
        for(int i = 0; i <str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-i)){
                return false;
                }
            }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindromeCheck(str));
    }
}
