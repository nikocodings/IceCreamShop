package application;

import Eatables.Eatables;
import sellers.IceCreamSalon;
import sellers.IceCreamSeller;
import sellers.PriceList;

import sellers.*;
import Eatables.*;

public class IceCreamApp2 {
    public static void main(String[] args) throws NoMoreIceCreamException {


            //Create a pricelist and stock to use for our icecreamcar

        PriceList pricelist = new PriceList(1.00, 1.2, 2);
        Stock stock = new Stock(0, 10, 10, 10);

            //Instantiating new icecreamcar with our created pricelist and stock

        IceCreamSeller car = new IceCreamCar(pricelist, stock);

            //Creating array to fill orders

        Eatables[] order = new Eatables[100];

            //Order different items and try to catch exceptions for every order
            try {
                order[0] = car.orderIceRocket();
            } catch (NoMoreIceCreamException nmice) {
                System.out.println(nmice.getMessage());}

            try {
                order[1] = car.orderMagnum(MagnumType.ALPINENUTS);
            } catch (NoMoreIceCreamException nmice) {
                System.out.println(nmice.getMessage());
            }

            try {
                order[2] = car.orderMagnum(MagnumType.ALPINENUTS);
            } catch (NoMoreIceCreamException nmice){
                System.out.println(nmice.getMessage());
            }

            try {
                order[3] = car.orderCone(new Flavor[]{Flavor.BANANA, Flavor.LEMON, Flavor.MOKKA});
            } catch (NoMoreIceCreamException nmice) {
                System.out.println(nmice.getMessage());
            }

                //Print the array of orders with for each loop and catch the empty indexes
            for (Eatables o : order) {

                if (o != null) {

                    o.eat();

                }
            }
                //Print total profit accumulated
            System.out.println("Total profit is: " + car.getProfit() + " euro.");

        }
    }


