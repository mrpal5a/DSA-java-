public class Inheritances {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog raees = new Dog();
        raees.eat();
        raees.legs = 4;
        System.err.println(raees.legs);
        raees.color = "brown";
        System.out.println(raees.color);
        raees.breathe();
        raees.breed = "Australian Shepherd";
        System.out.println(raees.breed);
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
}

// Derived class of Animal
class Mammals extends Animal{
    int legs;
}

//Multi level inheritance and Derived class of Mammals
class Dog extends Mammals{
    String breed;
}

