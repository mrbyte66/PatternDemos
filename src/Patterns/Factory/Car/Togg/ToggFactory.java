package Patterns.Factory.Car.Togg;

import Patterns.Factory.Car.CarFactory;

public class ToggFactory extends CarFactory {
    @Override
    public void createAuto() {
        getCarList().add(new Suv(250));
    }
}
