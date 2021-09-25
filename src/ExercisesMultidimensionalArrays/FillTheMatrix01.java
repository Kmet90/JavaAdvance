package ExercisesMultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int matrixSize = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix;

        if (pattern.equals("A")) {
            matrix = feelMatrixA(matrixSize);
        } else {
            matrix = feelMatrixB(matrixSize);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] r : matrix) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(r[c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] feelMatrixB(int size) {
        int[][] matrix = new int[size][size];
        int startNumber = 1;
        for (int c = 0; c < matrix.length; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < matrix.length; r++) {
                    matrix[r][c] = startNumber;
                    startNumber++;
                }
            } else {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    matrix[r][c] = startNumber;
                    startNumber++;
                }
            }
        }
        return matrix;
    }

    private static int[][] feelMatrixA(int size) {
        int[][] matrix = new int[size][size];
        int startNumber = 1;
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][c] = startNumber;
                startNumber++;
            }
        }
        return matrix;
    }

}

