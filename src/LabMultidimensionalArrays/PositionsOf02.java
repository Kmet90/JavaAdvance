package LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimension = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        int[][] matrix = readMatrix(scanner, rows);

        int count = 0;
        int searchNumber = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchNumber){
                    System.out.println(row + " " + col);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(Scanner scanner, int rows) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
