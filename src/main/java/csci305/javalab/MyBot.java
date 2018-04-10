package csci305.javalab;

import java.util.*;

/******************************************************
 * My Bot sorts the moves by name, and plays them in
 * alphabetical order.
 ******************************************************/

public class MyBot extends Player {
    private ArrayList<String> alpha = new ArrayList<>();
    private int j;
    private Element move;

    public MyBot(String name, Map<Integer, Element> moves) {
        super(name, moves);
        movesToList();
        j = 0;
    }

    private void movesToList() {
        for (int i = 1; i < 6; i++) {
            alpha.add(moves.get(i).getName());
        }
        Collections.sort(alpha, String.CASE_INSENSITIVE_ORDER);
    }

    @Override
    public Element play() {
        for (int i = 1; i < 6; i++) {
            if (alpha.get(j) == moves.get(i).getName()) {
                move = moves.get(i);
                break;
            }
        }
        j++;
        return move;
    }

}
