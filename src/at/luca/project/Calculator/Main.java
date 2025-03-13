package at.luca.project.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Scientific_Calculator s1 = new Scientific_Calculator();
        Root_Calculator r1 = new Root_Calculator();
        Scanner scanner = new Scanner(System.in);

        c1.addition(scanner.nextDouble(), scanner.nextDouble());
        c1.subtraction(scanner.nextDouble(), scanner.nextDouble());
        c1.multiplication(scanner.nextDouble(), scanner.nextDouble());
        c1.division(scanner.nextDouble(), scanner.nextDouble());

        s1.cosinus(scanner.nextDouble());
        s1.sinus(scanner.nextDouble());

        r1.root(scanner.nextDouble());
    }
}