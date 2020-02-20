package com.knoldus.training.factorypattern;

public class Main {

    public static void main(String[] args) {



	  Car smallCar = new SmallCar(true) ;
	  Car lux = new LuxuryCar() ;



	  Car lux2 = CarFactory.buildCar(CarType.LUXURY) ;

	  System.out.println("Car built:"+lux2.toString());

    }
}
