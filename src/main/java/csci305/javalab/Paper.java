package csci305.javalab;

/******************************************************
 * This is the Paper class.
 * Paper beats Rock and Spock.
 ******************************************************/

public class Paper extends Element {

    public Paper(String name) {
        super(name);
    }

    @Override

    public String getName() {
        return this.name;
    }

    /******************************************************
     * This method compares two elements and returns what
     * the outcome was.
     ******************************************************/
    public String compareTo(Element e) {
        o = new Outcome(this, e);
        return o.getOutcome();
    }
}