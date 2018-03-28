package csci305.javalab;
/******************************************************
 * This is the Spock class.
 * Spock beats Rock & Scissors.
 ******************************************************/

public class Spock extends Element {

    public Spock(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o.getOutcome() + " -- " + o.getType();
    }
}