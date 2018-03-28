package csci305.javalab;
import java.util.*;

/******************************************************
 * The Random Bot plays a random move.
 ******************************************************/

public class RandomBot extends Player {
    public String name;
    private Map<Integer, Element> moves;

    public RandomBot(String name, Map<Integer, Element> moves){
        super(name);
        this.moves = moves;
    }

    public String getName(){
        return name;
    }
    @Override
    public Element play(){
        return moves.get((Math.random() * 5)+1);
    }
}