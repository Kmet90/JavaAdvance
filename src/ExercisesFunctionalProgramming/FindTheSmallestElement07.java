package ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> indexOfMinNumber = array -> {
            int minElement = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < array.size(); i++) {
                if (minElement >= array.get(i)) {
                    minElement = array.get(i);
                    index = i;
                }
            }
            return index;
        };
        System.out.println(indexOfMinNumber.apply(numbers));
    }
}
