package csci305.javalab;

import java.util.*;
/******************************************************
 * This is the base Player class.
 ******************************************************/

public abstract class Player {
    public String name;
    Map <Integer, Element> moves;
    public Player(String name, Map <Integer, Element> moves){

        this.name = name;
        this.moves = moves;
    }

    public String getName(){
        return name;
    }

    public void setNextMove(Element e){}

    public abstract Element play();
        }