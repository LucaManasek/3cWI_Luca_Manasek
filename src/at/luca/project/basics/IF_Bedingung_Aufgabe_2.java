package at.luca.project.basics;

import java.util.Random;

public class IF_Bedingung_Aufgabe_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zah1 1 ist kleiner als Zahl 2 und Mini");
        }
        else if (randomNumber1 < 30 || randomNumber2 < 30) {
            System.out.println("Eine der Beiden ist kleiner als 30");
        }
        else if (randomNumber1 < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
        System.out.println(randomNumber1 + " " + randomNumber2);
    }


}
