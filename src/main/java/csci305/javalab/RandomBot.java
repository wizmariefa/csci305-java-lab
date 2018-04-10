package csci305.javalab;

import java.util.*;

/******************************************************
 * The Random Bot plays a random move.
 ******************************************************/

public class RandomBot extends Player {

    public RandomBot(String name, Map<Integer, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        Random ran = new Random();
        int x = ran.nextInt(5) + 1;
        return moves.get(x);
    }
}