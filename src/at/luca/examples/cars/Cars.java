package at.luca.examples.cars;

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

        System.out.println("Der Preis beträgt: " );
    }
}
