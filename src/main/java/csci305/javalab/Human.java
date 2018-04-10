package csci305.javalab;

import java.util.*;

/******************************************************
 * The Human bot is for each person to choose their own.
 ******************************************************/

public class Human extends Player {
    private Element move;
    Scanner sc = new Scanner(System.in);

    public Human(String name, Map<Integer, Element> moves) {
        super(name, moves);
    }

    public Element play() {
        int choice;
        printMenu();
        do {
            System.out.println("Enter your move: ");
            choice = getMove();
            if (choice > 5 || choice < 1) {
                System.out.println("Invalid move. Please try again.");
            }
        } while (choice > 5 || choice < 1);

        move = moves.get(choice);

        return move;
    }

    private void printMenu() {
        System.out.println("\t(1) : Rock\n" +
                "\t(2) : Paper\n" +
                "\t(3) : Scissors\n" +
                "\t(4) : Lizard\n" +
                "\t(5) : Spock\n");
    }

    private int getMove() {
        int i = sc.nextInt();
        return i;
    }
}