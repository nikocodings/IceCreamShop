package Eatables;

public class Magnum implements Eatables {
    MagnumType type;

    public Magnum(){

    }

    public Magnum(MagnumType type){
        this.type=type;

    }

    public void eat(){
        System.out.println("I'm eating a " + type + " Magnum.");

    }

    public MagnumType getType(){
        return type;
    }
}
