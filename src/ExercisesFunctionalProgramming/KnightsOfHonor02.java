package ExercisesFunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> printName = System.out::println;

        for (String name : names) {
            printName.accept("Sir " +name);
        }
    }
}
