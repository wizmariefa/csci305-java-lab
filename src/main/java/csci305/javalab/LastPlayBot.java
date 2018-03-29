package csci305.javalab;
import java.util.*;

/******************************************************
 * The Iterative bot cycles through each of the moves.
 ******************************************************/

public class LastPlayBot extends Player {
    private Element move;

    public LastPlayBot(String name, Map<Integer, Element> moves) {
        super(name, moves);
        move = moves.get(1);
    }

    public void setNextMove(Element e){
        this.move = e;
    }

    @Override
    public Element play() {
        return(move);
    }
}