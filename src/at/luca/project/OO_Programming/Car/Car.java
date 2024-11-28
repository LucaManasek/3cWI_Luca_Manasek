package at.luca.project.OO_Programming.Car;

public class Car {
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public int fuelAmount;
    public int maxFuelAmount;
    private String color;

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
}