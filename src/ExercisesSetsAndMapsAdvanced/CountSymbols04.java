package ExercisesSetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!symbols.containsKey(ch)) {
                symbols.put(ch, 1);
            } else {
                symbols.put(ch, symbols.get(ch) + 1);
            }
        }
//        for (Character name: symbols.keySet()) {
//            String key = name.toString();
//            String value = symbols.get(name).toString();
//            System.out.println(key + ": " + value + " time/s");
//        }
        symbols.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));

    }
}
