package ExercisesSetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceOfNames = Integer.parseInt(scanner.nextLine());

        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < sequenceOfNames; i++) {
            names.add(scanner.nextLine());
        }
        names.forEach(System.out::println);
    }
}
