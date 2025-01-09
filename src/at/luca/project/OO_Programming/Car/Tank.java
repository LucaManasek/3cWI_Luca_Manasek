package at.luca.project.OO_Programming.Car;

public class Tank {
    private int maxFuelAmount;
    private int currentFuelAmount;

    public Tank(int currentFuelAmount, int maxFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
        this.maxFuelAmount = maxFuelAmount;
    }

    public int getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void setMaxFuelAmount(int maxFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
    }

    public void setCurrentFuelAmount(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }
}
