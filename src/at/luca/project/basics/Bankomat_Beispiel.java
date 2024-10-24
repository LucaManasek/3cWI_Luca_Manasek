package at.luca.project.basics;

import java.util.Scanner;

public class Bankomat_Beispiel {
    public static void main(String[] args) {
        int Kontostand = 0;
        boolean isfinished = false;
        while (!isfinished){
            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1){
                System.out.println("Wie viel soll eingezahlt werden?");
                int eingezahlt = scanner.nextInt();
                Kontostand = Kontostand + eingezahlt;
                System.out.println("Kontostand: " + Kontostand);
            }
            if (selection == 2){
                System.out.println("Wie viel soll ausgezahlt werden?");
                int ausgezahlt = scanner.nextInt();
                Kontostand = Kontostand - ausgezahlt;
            }
            if (selection == 3){
                System.out.println("Kontostand: " + Kontostand);
            }
            if (selection == 4){
                isfinished = true;
            }
        }

    }
}
