package ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ListOfPredicates09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        BiPredicate<int[], Integer> predicate = (array, number) -> {

            for (int i : array) {

                if (number % i != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= n; i++) {
            if (predicate.test(numbers, i)) {
                System.out.print(i + " ");
            }
        }

    }
}