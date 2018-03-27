package csci305.javalab;
/******************************************************
 * This is the element Lizard.
 * Lizard beats Spock and Paper.
 ******************************************************/

public class Lizard extends Element {

    public Lizard(String name){
        super(name);
    }
    @Override
    public Outcome compareTo(Element e){
        Outcome o = new Outcome(this, e);
        return o;
    }
}