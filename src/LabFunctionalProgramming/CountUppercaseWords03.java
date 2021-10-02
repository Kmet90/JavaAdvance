package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = str -> Character.isUpperCase(str.charAt(0));

        List<String> wordsWithUppercase = Arrays.stream(string)
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println(wordsWithUppercase.size());

        System.out.println(String.join(System.lineSeparator(), wordsWithUppercase));
    }
}
