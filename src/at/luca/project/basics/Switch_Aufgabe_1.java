package at.luca.project.basics;

import java.util.Random;

public class Switch_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5,11);

        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;

        }

        System.out.println(randomNumber);
    }
}
