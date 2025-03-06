package at.luca.examples.cars;

public class Engine {
    public enum type {Diesel, Gasoline}
    private int Power;
    private type type;

    public Engine(int power, type type) {
        Power = power;
        this.type = type;
    }

    public int getPower() {
        return Power;
    }
}
