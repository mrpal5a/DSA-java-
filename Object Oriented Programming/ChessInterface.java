public class ChessInterface {
    public static void  main(String args[]){
        // Queen q = new Queen();
        // q.moves();
        // Rook r = new Rook();
        // r.moves();
        // King k = new King();
        // k.moves();
        Bear b = new Bear();
        b.veg();
        b.nonVeg();
    }
}
//multiple inheritance of Interfaces example

interface omnivore{
    void nonVeg();
}

interface carnivore{
    void veg();
}

class Bear implements omnivore,carnivore{
    public void veg(){
        System.out.println("eats grass");
    }
    public void nonVeg(){
        System.out.println("eats meat");
    }
}

// interface example
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left, diagonal direction");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal direction - (by 1 step)");
    }
}

