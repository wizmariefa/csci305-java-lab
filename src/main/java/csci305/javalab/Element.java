package csci305.javalab;

/******************************************************
 * This is the element class, the superclass to each of
 * the available hand moves in the game.
 ******************************************************/

public abstract class Element {
    public String name;
    public Outcome o;

    public Element(String name) {
        this.name = name;
    }

    /******************************************************
     * Gets the name of the Element.
     ******************************************************/
    public String getName() {
        return name;
    }

    /******************************************************
     * This returns what outcome was generated.
     ******************************************************/
    public Outcome getOutcome() {
        return o;
    }

    public abstract String compareTo(Element e);

}