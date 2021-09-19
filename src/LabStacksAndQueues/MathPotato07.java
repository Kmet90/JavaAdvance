package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MathPotato07 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queueKids = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(queueKids::offer);

        int toss = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        while (queueKids.size() > 1) {
            for (int index = 1; index < toss; index++) {
                queueKids.offer(Objects.requireNonNull(queueKids.poll()));
            }
            if (isPrime(counter)) {
                System.out.println("Prime " + queueKids.peek());
            } else {
                System.out.println("Removed " + queueKids.poll());
            }
            counter++;
        }
        System.out.println("Last is " + queueKids.peek());
    }

    private static boolean isPrime(int cycle) {
        if (cycle == 1) {
            return false;
        }
        for (int i = 2; i < cycle; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}
