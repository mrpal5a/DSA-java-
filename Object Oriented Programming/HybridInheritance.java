public class HybridInheritance {
    public static void main(String[] args) {
        Human Anshu = new Human();
        Anshu.gender = "male"        ;
        Anshu.color = "dark brown";
        Anshu.breathe();
        Anshu.speaks();

        Dog raees = new Dog();
        raees.speak();

        Peacock mor = new Peacock();
        mor.nationalBird = "yes";
        mor.wings = "2";
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Bird extends Animal{
    String wings;
    void fly(){
        System.out.println("Flies");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}

class Dog extends Mammals{
    String breed;
    void speak(){
        System.out.println("Bao-Bao");
    }
}
class Cat extends Dog{
    void speak(){
        System.out.println("meow-meow");
    }
}
class Human extends Mammals{
    String gender;
    void speaks(){
        System.out.println("Talks");
    }
}
class Peacock extends Bird{
    String nationalBird;
    void Beautiful(){
        System.out.println("Yes it is beautiful");
    }
}

class Shark extends Fish{
    void large(){
        System.out.println("Yes, it is the largest animal");
    }
}
class Tuna extends Fish{
    void small(){
        System.out.println("It is small in size");
    }
}