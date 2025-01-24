public class fun_Over_dataType {

    // function overloading using Data Types
    public static float sum(float a, float b){ // this function will work when we give floating values to the sum function
        return a+b;
    }
    public static int sum(int a, int b){ // this function will work whe we give integer values to the sum function
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5)); // calling sum function through integer values
        System.out.println(sum(4.2f, 5.3f)); // calling sum function through floating values
    }
}
