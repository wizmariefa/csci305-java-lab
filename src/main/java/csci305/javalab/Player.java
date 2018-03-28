package csci305.javalab;

/******************************************************
 * This is the base Player class.
 ******************************************************/

public abstract class Player {
    public String name;
    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract Element play();
        }