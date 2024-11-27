package at.luca.project.basics;

import java.util.Scanner;

public class Caeser_Verschluesselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] character = input.toCharArray();
        for (int i = 0; i < character.length; i++) {
            if (character[i] == 'y' ) {
                character[i] = 'a';
            } else if (character[i] == 'z') {
                character[i] = 'b';
            }
            else {
                character[i] += 2;
            }
        }
        System.out.println(character);
    }
}
