package sellers;

import Eatables.*;

public class IceCreamCar implements IceCreamSeller{
    PriceList priceList;
    Stock stock;
    double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
    }

    public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException{

        return prepareCone(balls);
    }

        public Cone prepareCone (Flavor[]balls) throws NoMoreIceCreamException{
            Cone cone = new Cone(balls);
            if (stock.getBalls() < balls.length || stock.getCones() < 1) {

                throw new NoMoreIceCreamException("Not enough balls or cones in inventory.");

            } else {

                stock.cones -= 1;
                stock.balls -= balls.length;
                profit += balls.length * priceList.ballPrice;

            }
            return cone;
        }



    public IceRocket orderIceRocket() throws NoMoreIceCreamException{

        return prepareIceRocket();
    }

    public IceRocket prepareIceRocket() throws NoMoreIceCreamException{
        IceRocket icerocket = new IceRocket();
        if (stock.getIceRockets()<1){
            throw new NoMoreIceCreamException("No more Icerockets in stock.");
        }else {

            stock.iceRockets -= 1;
            profit += priceList.getRocketPrice();
            return icerocket;
        }
    }

    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException{
        return prepareMagnum(type);
    }

    public Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException{
        Magnum magnum = new Magnum(type);
        if(stock.getMagni()<1){
            throw new NoMoreIceCreamException("No more magnums in stock.");
        }else {

            stock.magni -= 1;
            profit += priceList.getMagnumStandardPrice(type);

            return magnum;
        }
    }

    public double getProfit(){
        return profit;
    }


}
