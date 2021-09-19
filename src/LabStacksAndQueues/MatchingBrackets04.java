package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int index = 0; index < input.length(); index++) {
            char ch = input.charAt(index);

            if (ch == '(') {
                stack.push(index);
            }
            if (ch == ')') {
                int startIndex = stack.pop();
                String contents = input.substring(startIndex, index + 1);
                System.out.println(contents);
            }
        }
    }
}
