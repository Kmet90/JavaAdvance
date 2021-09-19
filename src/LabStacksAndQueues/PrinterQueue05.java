package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("print")) {

            if (!command.equals("cancel")) {
                queue.offer(command);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            }
            command = scanner.nextLine();
        }
        // while (queue.size() > 0) {
        //   System.out.println(queue.poll());
        //  }
        queue.forEach(System.out::println);
    }
}
