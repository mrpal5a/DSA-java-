public class substring {
    public static String subString(String str, int start, int end){
        String substr = "";
        // int j = 0;
        for(int i = start; i < end;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(subString(str, 0, 5));
    }
}
