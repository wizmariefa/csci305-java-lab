package csci305.javalab;

/******************************************************
 * This is the Rock class.
 * Rock beats Lizard and Scissors.
 ******************************************************/

public class Rock extends Element {

    public Rock(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String compareTo(Element e) {
        o = new Outcome(this, e);
        return o.getOutcome();
    }
}