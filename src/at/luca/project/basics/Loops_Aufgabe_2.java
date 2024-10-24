package at.luca.project.basics;

public class Loops_Aufgabe_2 {
    public static void main(String[] args) {
        int Summe = 0;
        for (int i = 0; i <= 100; i=i+2) {
            Summe = Summe + i;
            System.out.println(Summe);
        }
    }
}
