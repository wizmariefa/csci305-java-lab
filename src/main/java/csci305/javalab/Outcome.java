package csci305.javalab;

/******************************************************
 * This is the Outcome class.
 * It decides what wins and returns the String.
 ******************************************************/

public class Outcome {

    private String outcome = "";

    private String type = "";

    public Outcome(Element first, Element second) {
        determine(first, second);
    }

    /******************************************************
     * This method returns the outcome of the game, the
     * String "x beats x."
     ******************************************************/
    public String getOutcome() {
        return outcome;
    }

    /******************************************************
     * These method returns either Win, Lose, or Tie.
     ******************************************************/
    public String getType() {
        return type;
    }

    private void determine(Element first, Element second) {
        if (first.getName() == second.getName()) {
            outcome = first.getName() + " equals " + second.getName();
            type = "Tie";
        } else if (first.getName() == "Rock") {
            if (second.getName() == "Scissors") {
                outcome = "Rock crushes Scissors";
                type = "Win";
            } else if (second.getName() == "Lizard") {
                outcome = "Rock crushes Lizard";
                type = "Win";
            } else {
                determine(second, first);
                type = "Lose";
            }

        } else if (first.getName() == "Paper") {
            if (second.getName() == "Rock") {
                outcome = "Paper covers Rock";
                type = "Win";
            } else if (second.getName() == "Spock") {
                outcome = "Paper disproves Spock";
                type = "Win";
            } else {
                determine(second, first);
                type = "Lose";
            }
        } else if (first.getName() == "Scissors") {
            if (second.getName() == "Paper") {
                outcome = "Scissors cut Paper";
                type = "Win";
            } else if (second.getName() == "Lizard") {
                outcome = "Lizard eats Paper";
                type = "Win";
            } else {
                determine(second, first);
                type = "Lose";
            }
        } else if (first.getName() == "Lizard") {
            if (second.getName() == "Spock") {
                outcome = "Lizard poisons Spock";
                type = "Win";
            } else if (second.getName() == "Paper") {
                outcome = "Lizard eats Paper";
                type = "Win";
            } else {
                determine(second, first);
                type = "Lose";
            }
        } else if (first.getName() == "Spock") {
            if (second.getName() == "Rock") {
                outcome = "Spock vaporizes Rock";
                type = "Win";
            } else if (second.getName() == "Scissors") {
                outcome = "Spock smashes Scissors";
                type = "Win";
            } else {
                determine(second, first);
                type = "Lose";
            }

        }

    }

}