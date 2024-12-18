package at.luca.project.OO_Programming.Car;

public class Car {
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private int fuelAmount;
    private int maxFuelAmount;
    private String color;
    private Engine engine;

    public Car(int fuelConsumption, String brand, String serialNumber, Engine engine) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this. serialNumber = serialNumber;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void doBreak() {
        System.out.println("Ich Bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount >= this.maxFuelAmount / 10 ) {
            System.out.println("SuperBoostModer");
        }
        else  {
            System.out.println("Not enough fuel to go Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuut");
        }
    }

    public void getRemainingRange() {
        System.out.println(this.fuelAmount / this.fuelConsumption);
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public void setMaxFuelAmount(int maxFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}