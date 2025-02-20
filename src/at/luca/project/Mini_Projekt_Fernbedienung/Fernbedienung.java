package at.luca.project.Mini_Projekt_Fernbedienung;

import java.util.List;

public class Fernbedienung {
    private List<Batterie> batteries;

    public Fernbedienung(List<Batterie> batteries) {
        this.batteries = batteries;
    }

    public List<Batterie> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Batterie> batteries) {
        this.batteries = batteries;
    }

    public void addBatterie(Batterie batterie) {
        this.batteries.add(batterie);
    }

    public void turnOn() {

    }
}