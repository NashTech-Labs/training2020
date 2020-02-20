package com.knoldus.training.factorypattern;

public class SmallCar extends Car {


    SmallCar(Boolean print) {
        super(CarType.SMALL);
        System.out.println("Yes I print");
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}