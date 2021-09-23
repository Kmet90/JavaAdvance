package LabMultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("q")) {
                    String queen = matrix[row][col];

                    boolean isOnlyQueen = theOnlyQueen(matrix, row, col, queen);
                    if (isOnlyQueen) {
                        System.out.println(row + " " + col);
                    } else {
                        break;
                    }
                }
            }
        }

    }

    private static boolean theOnlyQueen(String[][] matrix, int row, int col, String queen) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i][col].equals("q"))) {
                count++;
                if (count == 2) {
                    return false;
                }
            }
        }
        count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[row][i].equals("q"))) {
                count++;
                if (count == 2) {
                    return false;
                }
            }
        }
        for (int i = row + 1; i < matrix.length - col; i++) {
            if (row == matrix.length) {
                break;
            } else {

                col += 1;
                if (queen.equals(matrix[i][col])) {
                    return false;
                }
            }
        }

        for (int i = row + 1; i < matrix.length; i++) {
            if (col == 0) {
                break;
            } else {
                col -= 1;
                if (queen.equals(matrix[i][col])) {
                    return false;
                }
            }
        }
        return true;
    }
}