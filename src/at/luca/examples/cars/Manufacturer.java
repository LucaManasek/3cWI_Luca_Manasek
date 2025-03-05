package at.luca.examples.cars;

public class Manufacturer {
    private String landOfOrigin;
    private int Sale;

    public Manufacturer(String landOfOrigin, int sale) {
        this.landOfOrigin = landOfOrigin;
        Sale = sale;
    }

    public String getLandOfOrigin() {
        return landOfOrigin;
    }

    public void setLandOfOrigin(String landOfOrigin) {
        this.landOfOrigin = landOfOrigin;
    }

    public int getSale() {
        return Sale;
    }

    public void setSale(int sale) {
        Sale = sale;
    }
}
