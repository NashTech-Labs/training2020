package com.training.knoldus.model;

import com.training.knoldus.enums.CarType;
import com.training.knoldus.enums.Location;

public class SmallCar extends Car {
    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
