package csci305.javalab;
/******************************************************
 * This is the element Lizard.
 * Lizard beats Spock and Paper.
 ******************************************************/

public class Lizard extends Element {

    public Lizard(String name){
        super(name);
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String compareTo(Element e){
        o = new Outcome(this, e);
        return o.getOutcome();
    }
}