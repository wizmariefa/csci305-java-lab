package csci305.javalab;
/******************************************************
 * This is the Scissors class.
 * Scissors beats Paper and Lizard.
 ******************************************************/

public class Scissors extends Element {

    public Scissors(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o.getOutcome() + " -- " + o.getType();
    }
}