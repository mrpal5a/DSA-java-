public class functionBasics{
    // creating a first functio
    public static void printHelloWorld(){ // void is the return type of this function
        System.out.println("Hello World"); // it will print the Hello World
    }
    public static int sum(int a, int b){  // these are parameters or formal parameters
        // this function is not void, so it should return something out of this
        int c = (a + b);
        //return a + b; // so we have to compulsary write this return statement 
        return c; // in every function there should be only one return statement,
    }
    public static void main(String args[]){ // this is the main function, when we runs the program,this function is executed first by default and "main" is the reserved keyword in java
        printHelloWorld(); // calling the printHelloWorld function
        int c = sum(3,4); // these are Arguments or Actual parameters 
        // here c will store the value that is returned by sum function, here the sum function will return 7, so 7 will be stored in c
        System.out.println(c); // also here varable c is different from sum function's variable c, so both c has different values and this is because of scope of variable, means functions c is only available inside function
    }
}