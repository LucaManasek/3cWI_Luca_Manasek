package at.luca.project.basics;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel_Beispiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int diceSum1 = 0;
        int diceSum2 = 0;
        int gameCounter = 0;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("1. Roll the dice (you have " + (6 - gameCounter) + (" rolls left"));
            System.out.println("2. End the game");
            int selection = scanner.nextInt();
            if (selection==1) {
                int randomNum1 = random.nextInt(0,6);
                int randomNum2 = random.nextInt(0,6);
                diceSum1 = diceSum1 + randomNum1;
                diceSum2 = diceSum2 + randomNum2;
                System.out.println("Your rolled a " + randomNum1);
                System.out.println("Your opponent rolled a " + randomNum2 + "\n");
                System.out.println("Your dice sum is " + diceSum1);
                gameCounter++;
            }
            if (selection == 2 || gameCounter == 6) {
                isFinished = true;
            }
        }
        System.out.println("Your dice sum is " + diceSum1 + " while your opponents dice sum is " + diceSum2);
        if (diceSum1 < diceSum2) {
            System.out.println("You've lost :c");
        }
        else if (diceSum1 == diceSum2) {
            System.out.println("It's a draw");
        }
        else {
            System.out.println("You've won!");
        }
    }
}