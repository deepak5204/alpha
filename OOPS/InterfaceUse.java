package OOPS;

public class InterfaceUse {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
    
}


interface ChessPlayer{
    //by default public and abstract
    void moves();
}

class Queen implements ChessPlayer{

    @Override
    //here we need to define public otherwise it will be default
    public void moves() {
        System.out.println("left, right, up,down and diagonal (in all 4 direction)");
    }  
}

class King implements ChessPlayer{

    @Override
    //here we need to define public otherwise it will be default
    public void moves() {    
        System.out.println("left, right, up,down and diagonal (by 1 step)"); 
    }

    
}