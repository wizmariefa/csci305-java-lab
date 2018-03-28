package csci305.javalab;
/******************************************************
 * This is the Paper class.
 * Paper beats Rock and Spock.
 ******************************************************/

public class Paper extends Element {

    public Paper(String name){
        super(name);
    }
    @Override
    public String compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o.getOutcome() + " -- " + o.getType();
    }
}