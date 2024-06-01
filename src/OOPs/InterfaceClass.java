package OOPs;
import java.util.*;
public class InterfaceClass {
    public static void main(String[] args) {
        // interface--> is a blueprint of a class --> is a blueprint of objects
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class Rook implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}
