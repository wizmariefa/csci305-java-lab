package csci305.javalab;
import java.util.HashMap;
import java.util.*;

/******************************************************
 * This is the Main class, where the game is run.
 ******************************************************/

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Element> moves = new HashMap<>();
        Lizard lizard = new Lizard("Lizard");
        Paper paper = new Paper("Paper");
        Rock rock = new Rock("Rock");
        Scissors scissors = new Scissors("Scissors");
        Spock spock = new Spock("Spock");

        moves.put(1, rock);
        moves.put(2, paper);
        moves.put(3, scissors);
        moves.put(4, lizard);
        moves.put(5, spock);

        Player p1 = new StupidBot("StupidBot", moves);
        Player p2 = new RandomBot("RandomBot", moves);
        Element p1move = p1.play();
        Element p2move = p2.play();
        System.out.println(p1move.compareTo(p2move));
    }
}