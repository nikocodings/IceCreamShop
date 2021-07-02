package sellers;

import Eatables.*;

public class IceCreamSalon implements IceCreamSeller{
    PriceList priceList = new PriceList();
    double totalProfit = 0;

    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
    }

    public double getProfit(){
        return totalProfit;
    }

    public Cone orderCone(Flavor[] balls){
        Cone cone = new Cone(balls);

        totalProfit += balls.length* priceList.getBallPrice();
        return cone;
    }

    public IceRocket orderIceRocket(){
        IceRocket icerocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return icerocket;
    }

    public Magnum orderMagnum(MagnumType type){
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumStandardPrice(type);
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
