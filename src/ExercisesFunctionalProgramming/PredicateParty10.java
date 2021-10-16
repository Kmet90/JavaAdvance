package ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PredicateParty10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String line;
        while (!(line = scanner.nextLine()).equals("Party!")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[1];

            BiPredicate<String, String> predicate = null;
            switch (command) {
                case "StartsWith":
                    predicate = String::startsWith;
                    break;
                case "EndsWith":
                    predicate = String::endsWith;
                    break;
                case "Length":
                    predicate = (n, l) -> {
                        int len = Integer.parseInt(l);
                        return n.length() == len;
                    };
                    break;
            }

            String removeOrDouble = tokens[0];
            if ("Double".equals(removeOrDouble)) {
                int size = names.size();
                for (int i = 0; i < size; i++) {
                    assert predicate != null;
                    if (predicate.test(names.get(i), tokens[2])) {
                        names.add(names.get(i));
                    }
                }
            } else if ("Remove".equals(removeOrDouble)) {
                for (int i = 0; i < names.size(); i++) {
                    assert predicate != null;
                    if (predicate.test(names.get(i), tokens[2])) {
                        names.remove(i);
                        i--;
                    }
                }
            }

        }

        Collections.sort(names);
        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
            return;
        }
        System.out.print(String.join(", ", names));
        System.out.println(" are going to the party!");
    }
}