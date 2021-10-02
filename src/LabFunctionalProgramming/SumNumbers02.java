package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Function<String, Integer> countIntegerSInString = str -> str.split(", ").length;

        Function<String, Integer> sumOfIntegersInString = str -> Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Count = " + countIntegerSInString.apply(input));
        System.out.println("Sum = " + sumOfIntegersInString.apply(input));
    }
}
