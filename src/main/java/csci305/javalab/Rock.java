package csci305.javalab;
/******************************************************
 * This is the Rock class.
 * Rock beats Lizard and Scissors.
 ******************************************************/

public class Rock extends Element {

    public Rock(String name){
        super(name);
    }
    @Override
    public Outcome compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o;
    }
}