package csci305.javalab;
/******************************************************
 * This is the Outcome class.
 * It decides what wins and returns the String.
 ******************************************************/

public class Outcome {

    public Element first;
    public Element second;

    public Element winner;
    public Element loser;

    public Outcome(Element first, Element second){
        this.first = first;
        this.second = second;
    }
}