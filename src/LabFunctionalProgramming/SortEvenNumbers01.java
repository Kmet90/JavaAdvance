package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.print(evenNumbers.toString().replaceAll("[\\[\\]]",""));
        System.out.println();

        Collections.sort(evenNumbers);
        System.out.print(evenNumbers.toString().replaceAll("[\\[\\]]",""));



    }
}
