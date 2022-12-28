package Patterns.Factory.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory {
    private List<Car> carList = new ArrayList<>();

    public CarFactory() {
        createAuto();
    }

    //Implemented by child classes to create a defined brand and model of the car
    public abstract void createAuto();

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(final List<Car> carList) {
        this.carList = carList;
    }
}
