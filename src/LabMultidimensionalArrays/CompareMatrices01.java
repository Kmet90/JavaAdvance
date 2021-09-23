package LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rowsFirstMatrix = dimensions[0];
        int colsFirstMatrix = dimensions[1];

        int[][] matrix1 = feelMatrix(scanner, rowsFirstMatrix);

        dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rowsSecondMatrix = dimensions[0];
        int colsSecondMatrix = dimensions[1];

        int[][] matrix2 = feelMatrix(scanner, rowsSecondMatrix);

        boolean isEqual = matricesAreEqual(matrix1, matrix2);

        String output = isEqual
                ? "equal"
                : "not equal";
        System.out.println(output);
    }

    private static boolean matricesAreEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) {
                return false;
            }
            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] feelMatrix(Scanner scanner, int rows) {
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
