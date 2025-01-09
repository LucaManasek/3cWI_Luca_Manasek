package at.luca.project.OO_Programming.Car;

public class Car {
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private Engine engine;
    private Tank tank;

    public Car(int fuelConsumption, String brand, String serialNumber, Engine engine, Tank tank) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.tank = tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void drive(int speed) {
        System.out.println("I am driving");
        this.tank.setCurrentFuelAmount(this.tank.getCurrentFuelAmount() - this.fuelConsumption * speed);
    }

    public void doBreak() {
        System.out.println("Ich Bremse");
    }

    public void turboBoost() {
        if (this.tank.getCurrentFuelAmount() >= this.tank.getMaxFuelAmount() / 10 ) {
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
        System.out.println(this.tank.getCurrentFuelAmount() / this.fuelConsumption);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}