package at.luca.project.OO_Programming.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(7, "Audi", "A12345");
        c1.fuelAmount = 70;
        c1.maxFuelAmount = 70;

        Car c2 = new Car(6, "Mercedes", "M1234");
        c2.fuelAmount = 20;
        c2.maxFuelAmount = 40;

        Car c3 = new Car(14, "Volvo", "V1234");

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        c1.getRemainingRange();
        c1.drive();
        c1.getRemainingRange();

        c1.doBreak();

        c1.honk(4);
    }
}