package csci305.javalab;

import java.util.*;

/******************************************************
 * The Iterative bot cycles through each of the moves.
 ******************************************************/

public class IterativeBot extends Player {
    private int i;

    public IterativeBot(String name, Map<Integer, Element> moves) {
        super(name, moves);
        i = 1;
    }

    @Override
    public Element play() {
        Element move = moves.get(i);
        i++;
        return move;
    }
}