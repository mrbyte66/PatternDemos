package Patterns.Factory.Car;

public abstract class Car {
    private String brand = null;
    private String model = null;
    private int horsePower = 0;

    public Car(final String brand, final String model, final int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(final int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Brand : " + this.brand + ", " +
                "Model : " + this.model + ", " +
                "Horse Power" + this.horsePower;
    }
}
