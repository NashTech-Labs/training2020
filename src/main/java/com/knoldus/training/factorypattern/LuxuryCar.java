package com.knoldus.training.factorypattern;

public class LuxuryCar extends Car {

    LuxuryCar() {
        super(CarType.LUXURY);
        construct();

    }
    @Override
    public String toString()  {
        return "Luxury Car" ;
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
