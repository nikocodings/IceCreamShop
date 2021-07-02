package sellers;


import Eatables.*;

public class PriceList {
    double ballPrice = 1.00;
    double rocketPrice = 1.2;
    double magnumStandardPrice = 2;

    public PriceList(){

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){

    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumType magnum) {
        switch(magnum){
            case ROMANTICSTRAWBERRIES:
            case ALPINENUTS: return magnumStandardPrice*1.5;
            case MILKCHOCOLATE:
            case WHITECHOCOLATE:
            case BLACKCHOCOLATE:
            default: return magnumStandardPrice;
        }
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
