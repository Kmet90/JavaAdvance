package ExercisesMultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        String[][] matrix;
        matrix = fillMatrix(matrixSize, scanner);

        int sumFirstDiagonal = sumFirstDiagonal(matrixSize, matrix);
        int sumSecondDiagonal = sumSecondDiagonal(matrixSize, matrix);

        System.out.println(Math.abs(sumFirstDiagonal - sumSecondDiagonal));

    }

    private static int sumSecondDiagonal(int matrixSize, String[][] matrix) {
        int sum = 0;
        int rows = 0;
        int cols = matrixSize - 1;
        while (rows < matrixSize && cols >= 0) {
            sum += Integer.parseInt(matrix[rows][cols]);
            rows++;
            cols--;
        }
        return sum;
    }

    private static int sumFirstDiagonal(int matrixSize, String[][] matrix) {
        int sum = 0;
        int rows = 0;
        int cols = 0;
        while (rows < matrixSize && cols < matrixSize) {
            sum += Integer.parseInt(matrix[rows][cols]);
            rows++;
            cols++;
        }
        return sum;
    }

    private static String[][] fillMatrix(int rows, Scanner scanner) {
        String[][] matrix = new String[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
}
