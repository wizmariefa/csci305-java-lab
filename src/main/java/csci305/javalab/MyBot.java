package csci305.javalab;

import java.util.*;

/******************************************************
 * My Bot is going to play them in alphabetical order.
 ******************************************************/

public class MyBot extends Player {
    public String name;
    private Map<Integer, Element> moves;
    private ArrayList<String> alpha = new ArrayList<>();
    private int j;
    private Element move;

    public MyBot(String name, Map<Integer, Element> moves){
        super(name);
        this.moves = moves;
        movesToList();
        j = 1;
    }

    public String getName(){
        return name;
    }

    private void movesToList(){
        for (int i = 0; i < 6; i++){
            alpha.add(moves.get(i).getName());
        }
        Collections.sort(alpha, String.CASE_INSENSITIVE_ORDER);
    }

    @Override
    public Element play(){
        for(int i = 0; i < 6; i++){
            if (alpha.get(i) == moves.get(i).getName()){
                move = moves.get(i);
                break;
            }
        }
        return move;
    }

}
