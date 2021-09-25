package ExercisesMultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = feelMatrix(rows, cols);

        printMatrix(matrix);

    }

    private static String[][] feelMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        char startSymbol = 97;
        for (int row = 0; row < rows; row++) {
            char middleSymbol = startSymbol;

            for (int col = 0; col < cols; col++) {
                StringBuilder result = new StringBuilder(3);
                result.append(startSymbol).append(middleSymbol).append(startSymbol);
                matrix[row][col] = result.toString();
                result.setLength(0);
                middleSymbol++;
            }
            startSymbol++;
        }
        return matrix;
    }

    private static void printMatrix(String[][] finalMatrix) {
        for (String[] matrix : finalMatrix) {
            for (String element : matrix) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
