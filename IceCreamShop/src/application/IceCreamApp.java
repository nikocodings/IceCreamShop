package application;

import sellers.*;
import Eatables.*;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIceCreamException {

            //Create an pricelist to use for our salon

        PriceList pricelist = new PriceList(1.00,1.2,2);

            //Instantiate our new salon with our created pricelist

        IceCreamSeller salon = new IceCreamSalon(pricelist);

            //Creating an array and instantiate with orders

        Eatables[] order = {
                salon.orderIceRocket(),
                salon.orderMagnum(MagnumType.WHITECHOCOLATE),
                salon.orderMagnum(MagnumType.ALPINENUTS),
                salon.orderCone(new Flavor[]{Flavor.BANANA, Flavor.LEMON, Flavor.MOKKA})
        };

            //Print out the order array

        for (Eatables o: order){

            o.eat();
        }

            //Print out the profit
        System.out.println("Total profit is : " + salon.getProfit() + " euro.");

    }

}
