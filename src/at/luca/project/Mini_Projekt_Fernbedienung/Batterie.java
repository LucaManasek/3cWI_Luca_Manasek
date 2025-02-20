package at.luca.project.Mini_Projekt_Fernbedienung;

public class Batterie {
    private int Speicherstatus;

    public Batterie(int speicherstatus) {
        Speicherstatus = speicherstatus;
    }

    public int getSpeicherstatus() {
        return Speicherstatus;
    }

    public void setSpeicherstatus(int speicherstatus) {
        Speicherstatus = speicherstatus;
    }
}