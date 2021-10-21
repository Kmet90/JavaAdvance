package ExercisesGenerics.GenericSwapMethodInteger04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());


        Swap<Integer> collection = new Swap<>();
        while (inputLines-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            collection.add(number);
        }

        int[] indexesSwap = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        collection.swapIndexes(indexesSwap[0], indexesSwap[1]);

        System.out.println(collection);
    }
}
