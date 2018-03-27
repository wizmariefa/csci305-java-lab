package csci305.javalab;
/******************************************************
 * This is the element class, the superclass to each of
 * the available hand moves in the game.
******************************************************/

public abstract class Element {
    public String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract Outcome compareTo(Element e);

}