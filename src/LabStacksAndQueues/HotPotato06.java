package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HotPotato06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queueKids = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(queueKids::offer);

        int toss = Integer.parseInt(scanner.nextLine());


        while (queueKids.size() > 1) {
            for (int index = 1; index < toss; index++) {
                queueKids.offer(Objects.requireNonNull(queueKids.poll()));
            }
            System.out.println("Removed " + queueKids.poll());
        }
        System.out.println("Last is " + queueKids.peek());
    }
}
