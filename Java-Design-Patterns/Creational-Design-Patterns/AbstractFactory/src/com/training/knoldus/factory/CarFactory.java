package com.training.knoldus.factory;

import com.training.knoldus.enums.CarType;
import com.training.knoldus.model.Car;
import com.training.knoldus.enums.Location;

public class CarFactory {

    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarType type, Location location) {
        Car car = null;
        //Read location property somewhere from configuration
        //Use location specific car factory
        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;

    }
}
