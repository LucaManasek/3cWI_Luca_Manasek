package at.luca.examples.cars;


public class Main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Austria", 15);
        Manufacturer m2 = new Manufacturer("Germany", 10);

        Engine e1 = new Engine(200, Engine.type.Diesel);
        Engine e2 = new Engine(180, Engine.type.Gasoline);
        Engine e3 = new Engine(190, Engine.type.Gasoline);

        Cars c1 = new Cars("black", 340, 400000, 80,m1,e1);
        Cars c2 = new Cars("blue", 320,350000,75,m2,e2);
        Cars c3 = new Cars("red", 330, 380000,90,m2,e3);

        c1.getPrice();
        c2.getPrice();
        c3.getPrice();

        c1.fuelUsage(40000);
        c1.fuelUsage(60000);
    }
}