package at.luca.project.OO_Programming.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.fuelAmount = 70;
        c1.maxFuelAmount = 70;
        c1.serialNumber = "A1234";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.fuelAmount = 20;
        c2.maxFuelAmount = 40;
        c2.serialNumber = "M1234";

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
