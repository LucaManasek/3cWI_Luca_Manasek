package at.luca.project.basics;

import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isfinished = false;
        int Summe = 0;
        while (!isfinished){
            int randomNumber = random.nextInt(10,31);
            Summe = Summe + randomNumber;
            if (randomNumber == 15 || randomNumber == 25){
                isfinished = true;
                System.out.println(randomNumber);
            }
            System.out.println(Summe);
        }
    }
}
