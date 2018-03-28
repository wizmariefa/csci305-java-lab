package csci305.javalab;
import java.util.HashMap;
import java.util.*;

/******************************************************
 * This is the Main class, where the game is run.
 ******************************************************/

public class Main {

    public static void main(String[] args) {

        Map moves = new HashMap();
        Lizard lizard = new Lizard("Lizard");
        Paper paper = new Paper("Paper");
        Rock rock = new Rock("Rock");
        Scissors scissors = new Scissors("Scissors");
        Spock spock = new Spock("Spock");

        moves.put(1, lizard);
        moves.put(2, paper);
        moves.put(3, rock);
        moves.put(4, scissors);
        moves.put(5, spock);

        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
    }
}