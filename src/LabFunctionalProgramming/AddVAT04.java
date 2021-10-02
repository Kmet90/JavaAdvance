package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vatCalculator = val -> val * 1.2;

        String input = scanner.nextLine();

        System.out.println("Prices with VAT: ");

        Arrays.stream(input.split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(p-> System.out.printf("%.2f%n", p));
    }
}
