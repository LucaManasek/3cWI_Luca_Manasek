package at.luca.examples.cars;

import javax.swing.*;

public class Cars {
    private String color;
    private int maxVelocity;
    private int basePrice;
    private int baseConsume;
    private Manufacturer manufacturer;
    private Engine engine;

    public Cars(String color, int maxVelocity, int basePrice, int baseConsume, Manufacturer manufacturer, Engine engine) {
        this.color = color;
        this.maxVelocity = maxVelocity;
        this.basePrice = basePrice;
        this.baseConsume = baseConsume;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsume() {
        return baseConsume;
    }

    public void setBaseConsume(int baseConsume) {
        this.baseConsume = baseConsume;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void getPrice() {
        float endPrice = getBasePrice() - getBasePrice() * (this.manufacturer.getSale() / 100);
        System.out.println("Der Preis beträgt: " + endPrice);
    }

    public void fuelUsage (int distanceTraveled) {
        if (distanceTraveled<=50000) {
            System.out.println("Der Benzinverbrauch beträgt " + getBaseConsume());
        }
        else {
            System.out.println("Der Benzinverbrauch beträgt " + (getBaseConsume() + getBaseConsume() * 0.098));
        }
    }
}
