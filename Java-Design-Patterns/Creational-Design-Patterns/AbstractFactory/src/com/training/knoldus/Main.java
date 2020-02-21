package com.training.knoldus;

import com.training.knoldus.enums.Location;
import com.training.knoldus.factory.CarFactory;
import com.training.knoldus.enums.CarType;

/*
    Abstract factory pattern is used whenever we need another level of abstraction
    over a group of factories created using factory pattern.
*/
public class Main {

    public static void main(String[] args)
    {
        /* Location can be derived from a configuration file,
        but here we're passing it to the car factory */
        System.out.println(CarFactory.buildCar(CarType.SMALL, Location.ASIA));
        System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.USA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
    }
}
/*
    - Abstract Factory Pattern provides another
    level of abstraction over a group of factories
        - In the case of this application we have Location
          being abstracted over our factories
    - Code very similar to Factory Pattern
*/
