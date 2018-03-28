package csci305.javalab;
import sun.jvm.hotspot.StackTrace;

import java.util.*;

/******************************************************
 * The Human bot is for each person to choose their own.
 ******************************************************/

public class Human extends Player {
    public String name;
    private Map<Integer, Element> moves;
    private Element move;
    Scanner sc = new Scanner(System.in);
    boolean goodMove = false;

    public Human(String name, Map<Integer, Element> moves){
        super(name);
        this.moves = moves;
    }

    public Element play(){
        int choice = -1;
        printMenu();
        while (goodMove = false) {
            System.out.println("Enter your move: ");
            choice = getMove();
        }

        move = moves.get(choice);

        return move;
    }

    private void printMenu(){
        System.out.println("\t(1) : Rock\n" +
                "\t(2) : Paper\n" +
                "\t(3) : Scissors\n" +
                "\t(4) : Lizard\n" +
                "\t(5) : Spock\n");
    }

    private int getMove(){
        String s = sc.next();
        int i = -1;
        try {i = Integer.parseInt(s);}
        catch (NumberFormatException n){n.printStackTrace();}
        if (i >= 1 && i <= 5) { goodMove = true; }
        return i;
    }
}