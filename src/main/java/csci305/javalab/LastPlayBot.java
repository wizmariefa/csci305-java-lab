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

    /******************************************************
     * Sets player's next move, based on what the other
     * player passes in from the last round.
     ******************************************************/
    public void setNextMove(Element e) {
        this.move = e;
    }

    @Override
    public Element play() {
        return (move);
    }
}