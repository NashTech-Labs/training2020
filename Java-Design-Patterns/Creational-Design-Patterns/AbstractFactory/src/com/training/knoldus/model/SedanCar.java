package com.training.knoldus.model;
import com.training.knoldus.enums.CarType;
import com.training.knoldus.enums.Location;

public class SedanCar extends Car {
    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
