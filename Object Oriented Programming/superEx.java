public class superEx {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super(); // it will call it's immediate parents class
        super.color = "brown"; // accessing properties of immediate parent class using super keyword
        System.out.println("Horse Constructor is called");
    }
}