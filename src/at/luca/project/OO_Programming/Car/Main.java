package at.luca.project.OO_Programming.Car;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(150, Engine.type.DIESEL);
        Engine e2 = new Engine(120, Engine.type.DIESEL);
        Engine e3 = new Engine(180, Engine.type.GASOLINE);
        Car c1 = new Car(7, "Audi", "A12345", e1);
        c1.setFuelAmount(70);
        c1.setMaxFuelAmount(70);

        Car c2 = new Car(6, "Mercedes", "M1234", e2);
        c2.setFuelAmount(20);
        c2.setMaxFuelAmount(40);

        Car c3 = new Car(14, "Volvo", "V1234", e3);

        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());

        c1.getRemainingRange();
        c1.drive();
        c1.getRemainingRange();

        c1.doBreak();

        c1.honk(4);
        System.out.println(c2.getEngine().getHorsepower());
    }
}