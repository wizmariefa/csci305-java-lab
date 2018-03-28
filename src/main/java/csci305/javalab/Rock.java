package csci305.javalab;
/******************************************************
 * This is the Rock class.
 * Rock beats Lizard and Scissors.
 ******************************************************/

public class Rock extends Element {
    private String name;
    public Rock(String name){
        this.name = name;
    }
    @Override
    public String compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o.getOutcome() + " -- " + o.getType();
    }
}