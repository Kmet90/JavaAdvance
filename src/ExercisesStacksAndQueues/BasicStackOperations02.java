package ExercisesStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(minNumber(stack));
        }
    }

    private static int minNumber(ArrayDeque<Integer> stack) {
        int min = Integer.MAX_VALUE;
        int number = stack.pop();
        if (min > number) {
            min = number;
        }
        return min;
    }
}
