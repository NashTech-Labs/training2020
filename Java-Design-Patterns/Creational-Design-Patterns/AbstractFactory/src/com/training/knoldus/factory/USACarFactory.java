package com.training.knoldus.factory;

import com.training.knoldus.enums.CarType;
import com.training.knoldus.enums.Location;
import com.training.knoldus.model.Car;
import com.training.knoldus.model.LuxuryCar;
import com.training.knoldus.model.SedanCar;
import com.training.knoldus.model.SmallCar;


public class USACarFactory {
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case SMALL:
                car = new SmallCar(Location.USA);
                break;

            case SEDAN:
                car = new SedanCar(Location.USA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;

            default:
                //throw some exception
                break;
        }
        return car;
    }
}
