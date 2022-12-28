package Patterns.Factory;

import Patterns.Factory.Car.Bmw.BmwFactory;
import Patterns.Factory.Car.CarFactory;
import Patterns.Factory.Car.Togg.ToggFactory;

public class FactoryMain {
    public static void main(String[] args) {

        //Bmw Factory
        CarFactory bmwFactory = new BmwFactory();

        //Togg Factory
        CarFactory toggFactory = new ToggFactory();

        bmwFactory.getCarList().forEach(bmw -> System.out.println(bmw.toString()));

        toggFactory.getCarList().forEach(togg -> System.out.println(togg.toString()));
    }
}
