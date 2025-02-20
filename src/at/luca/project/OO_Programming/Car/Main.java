package at.luca.project.OO_Programming.Car;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(150, Engine.type.DIESEL);
        Engine e2 = new Engine(120, Engine.type.DIESEL);
        Engine e3 = new Engine(180, Engine.type.GASOLINE);

        Tank t1 = new Tank(70, 100);
        Tank t2 = new Tank(40, 110);
        Tank t3 = new Tank(50, 80);

        RearviewMirror r1 = new RearviewMirror(100,0);
        RearviewMirror r2 = new RearviewMirror(90,-40);

        Tires ti1 = new Tires(20, "Continental");

        List<Tires> tiresList = new ArrayList<Tires>();

        tiresList.add(ti1);
        tiresList.add(ti1);
        tiresList.add(ti1);
        tiresList.add(ti1);

        Tires ti2 = new Tires(30, "Michelin");

        Car c1 = new Car(7, "Audi", "A12345", e1, t1);
        Car c2 = new Car(6, "Mercedes", "M1234", e2, t2);
        Car c3 = new Car(14, "Volvo", "V1234", e3, t3);

        c1.addMirror(r1);
        c1.addMirror(r2);
        c2.addMirror(r1);
        c2.addMirror(r2);
        c3.addMirror(r1);
        c3.addMirror(r2);

        c1.addTires(tiresList);
        c2.drive(20);
        c1.getRemainingRange();
        c1.drive(40);
        c1.getRemainingRange();
        c1.doBreak();
        c1.honk(4);

        System.out.println(c2.getEngine().getHorsepower());
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getTires());
    }
}