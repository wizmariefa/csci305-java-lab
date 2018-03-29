package csci305.javalab;
import java.util.*;

/******************************************************
 * The Stupid Bot plays the same thing every time.
 ******************************************************/

public class StupidBot extends Player {

    public StupidBot(String name, Map<Integer, Element> moves){
        super(name, moves);
    }

    @Override
    public Element play(){
        return moves.get(1);
    }
}