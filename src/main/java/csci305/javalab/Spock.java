package csci305.javalab;
/******************************************************
 * This is the Spock class.
 * Spock beats Rock & Scissors.
 ******************************************************/

public class Spock extends Element {

    public Spock(String name){
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