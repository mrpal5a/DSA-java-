public class interted_half_pyramid_with_numbers {
    public static void interted_half(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= (n-i+1); j++ ){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        interted_half(5);
    }
}
