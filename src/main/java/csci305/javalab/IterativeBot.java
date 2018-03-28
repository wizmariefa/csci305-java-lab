package csci305.javalab;
import java.util.*;

/******************************************************
 * The Iterative bot cycles through each of the moves.
 ******************************************************/

public class IterativeBot extends Player {
    public String name;
    private Map<Integer, Element> moves;
    private int i;

    public IterativeBot(String name, Map<Integer, Element> moves) {
        super(name);
        this.moves = moves;
        i = 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public Element play() {
        Element move = moves.get(i);
        i++;
        return move;
    }
}