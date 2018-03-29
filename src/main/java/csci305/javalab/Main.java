package csci305.javalab;

import java.util.HashMap;
import java.util.*;

/******************************************************
 * This is the Main class, where the game is run.
 ******************************************************/

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int p1wins = 0;
    static int p2wins = 0;

    public static void printMenu() {
        System.out.println("Please choose two players:\n" +
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot\n");
    }

    public static Player getChoice(int n, Map<Integer, Element> m) {
        Player player = null;
        int choice;
        do {
            System.out.println("Select player " + n + ": ");
            choice = sc.nextInt();
            if (choice > 6 || choice < 1) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice > 6 || choice < 1);

        switch (choice) {
            case 1:
                player = new Human("Human", m);
                break;
            case 2:
                player = new StupidBot("Stupid Bot", m);
                break;
            case 3:
                player = new RandomBot("Random Bot", m);
                break;
            case 4:
                player = new IterativeBot("Iterative Bot", m);
                break;
            case 5:
                player = new LastPlayBot("Last Play Bot", m);
                break;
            case 6:
                player = new MyBot("My Bot", m);
                break;
        }

        return player;
    }

    public static void printOutcome(Element e) {
        String out = e.getOutcome().getType();

        if (out == "Win") {
            System.out.println("\tPlayer 1 won the round.\n");
            p1wins++;
        } else if (out == "Lose") {
            System.out.println("\tPlayer 2 won the round.\n");
            p2wins++;
        } else if (out == "Tie") {
            System.out.println("\tRound was a tie.\n");
        } else {
            System.out.println("If we here you fucked up Marie");
        }
    }

    public static void endRounds() {
        System.out.println("The score is " + p1wins + " to " + p2wins + ". ");
        if (p1wins > p2wins) {
            System.out.println("Player 1 is the winner. ");
        } else if (p2wins > p1wins) {
            System.out.println("Player 2 is the winner. ");
        } else {
            System.out.println("Game was a draw.");
        }
    }

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


        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Marie Morin.\n");
        printMenu();

        Player p1 = getChoice(1, moves);
        Player p2 = getChoice(2, moves);

        System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Round " + (i + 1) + ": ");

            Element p1move = p1.play();
            Element p2move = p2.play();

            System.out.println("\tPlayer 1 chose: " + p1move.getName());
            System.out.println("\tPlayer 2 chose: " + p2move.getName());
            System.out.println("\t" + p1move.compareTo(p2move));

            printOutcome(p1move);
            if (p2.getName() == "Last Play Bot") {
                    p2.setNextMove(p1move);
            } else if (p2.getName() == "Last Play Bot") {
                p2.setNextMove(p2move);
            }
        }
        endRounds();
    }
}