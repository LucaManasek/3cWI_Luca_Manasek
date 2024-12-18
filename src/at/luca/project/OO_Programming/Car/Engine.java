package at.luca.project.OO_Programming.Car;

public class Engine {
    public enum type {DIESEL, GASOLINE}
    private int Horsepower;
    private type type;

    public Engine(int horsepower, type type) {
        Horsepower = horsepower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("The motor is running with " + amount);
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public type getType() {
        return type;
    }
}