package ExercisesIteratorsAndComparators.ListyIterator01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1).collect(Collectors.toCollection(ArrayList::new));

        ListyIterator listyIterator = new ListyIterator(data);
        String command = scanner.nextLine();
        while (!command.equals("END")) {

            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.forEach(s -> System.out.print(s + " "));
                    System.out.println();
            }

            command = scanner.nextLine();
        }
    }
}

