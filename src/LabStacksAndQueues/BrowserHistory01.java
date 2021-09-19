package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String currentUrl = scanner.nextLine();

        while (!currentUrl.equals("Home")) {

            if (currentUrl.equals("back")) {
                if (stack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(currentUrl);
                System.out.println(stack.peek());
            }
            currentUrl = scanner.nextLine();
        }
    }
}
