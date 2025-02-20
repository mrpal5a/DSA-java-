public class AbstractEx {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang // all these(parent) constructors are created when we created child object Mustang
    }    
}

//abstract class. mtlb kisi bhi class ke aage abstract likh denge to wo abstract class ban jayega
abstract class Animal{
    String color;
    // abstract class cannot create an instance of an abstract class
    //but can have constructor
    Animal(){
        System.out.println("Animal constructor called");
        color = "brown";
    }

    // this is non-abstrat method
    void eat(){
        System.out.println("Animal eats");
    }
    //abstract method
    abstract void walk(); // abstract krte hai to only function define kr dete hai or har object ke liye uske alag alag value dete hai jaise ki yeh pe HORSE and CHICKEN ko diye walk ke liye
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }

    void changeColor(){
        color = "Dark Brown";
    }
}


class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color = "yellow";
    }
}
