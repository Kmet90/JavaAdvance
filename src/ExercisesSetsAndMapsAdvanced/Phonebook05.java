package ExercisesSetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>();

        while (!command.equals("search")) {
            String[] tokens = command.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];
            phoneBook.put(name, phoneNumber);
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("stop")) {
            if (phoneBook.containsKey(command)) {
                System.out.println(command + " -> " + phoneBook.get(command));
            } else {
                System.out.println("Contact "+command+" does not exist.");
            }

            command = scanner.nextLine();
        }
    }
}
