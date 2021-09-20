package ExercisesStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int command = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < command; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            switch (token[0]) {
                case "3":
                    int maxElement = 0;
                    if (stack.size() > 0) {
                        maxElement = Collections.max(stack);
                    }
                    System.out.println(maxElement);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "1":
                    int number = Integer.parseInt(token[1]);
                    stack.push(number);
                    break;
            }
        }
    }


}
