package Patterns.Factory.Car.Bmw;

import Patterns.Factory.Car.CarFactory;

public class BmwFactory extends CarFactory {
    @Override
    public void createAuto() {
        getCarList().add(new BmwZ4(300));
        getCarList().add(new BmwX6(320));
    }
}
