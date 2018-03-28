package csci305.javalab;
import java.util.*;

/******************************************************
 * The Stupid Bot plays the same thing every time.
 ******************************************************/

public class StupidBot extends Player {
    public String name;
    private Map<Integer, Element> moves;

    public StupidBot(String name, Map<Integer, Element> moves){
        super(name);
        this.moves = moves;
    }

    public String getName(){
        return name;
    }
    @Override
    public Element play(){
        return moves.get(1);
    }
}