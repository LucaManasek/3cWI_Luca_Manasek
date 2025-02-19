package at.luca.project.OO_Programming.Car;

public class Tires {
    private int size;
    private String brand;

    public Tires(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
