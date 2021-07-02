package Eatables;


public class Cone implements Eatables {
    Flavor[] balls = new Flavor[10];

    public Cone(){

    }

    public Cone(Flavor[] balls){
        this.balls = balls;

    }

    public void eat(){
        System.out.println("I'm eating a cone with:");
        for (Flavor f : balls){
            if(f!=null) {
                System.out.println(f);
            }
        }
    }
}
