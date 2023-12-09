package Lab3;

import java.util.Scanner;

public class Pro33_64010765 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = creatMatrix(size);
        showMatrix(matrix);
        checkMatrix(matrix);

        input.close();
    }

    public static int[][] creatMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int row = 0; row < matrixSize; row++) {
            for (int column = 0; column < matrixSize; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column]);
            }
            System.out.println("");
        }
    }

    public static void checkMatrix(int[][] matrix) {
        int rowCount = 0;
        int columnCount = 0;
        int diagonalCount = 0;
        int superCount = 0;
        int subCount = 0;

        // Check row
        for (int num = 0; num < 2; num++) {
            for (int row = 0; row < matrix.length; row++) {
                if (checkRow(matrix, row, num) == true) {
                    System.out.printf("All %ds on row %d\n", num, row);
                    rowCount += 1;
                }
            }
        }
        if (rowCount == 0) {
            System.out.println("No same numbers on a row");
        }

        // Check column
        for (int num = 0; num < 2; num++) {
            for (int column = 0; column < matrix.length; column++) {
                if (checkColumn(matrix, column, num) == true) {
                    System.out.printf("All %ds on column %d\n", num, column);
                    columnCount += 1;
                }
            }
        }
        if (columnCount == 0) {
            System.out.println("No same numbers on a column");
        }

        // Check superDiagonal
        for (int num = 0; num < 2; num++) {
            if (checkSuperdiagonal(matrix, num)) {
                System.out.printf("All %ds on the superdiagonal\n", num);
                superCount += 1;
            }
        }
        if (superCount == 0) {
            System.out.println("No same numbers on the superdiagonal");
        }

        // Check Diagonal
        for (int num = 0; num < 2; num++) {
            if (checkDiagonal(matrix, num)[0]) {
                System.out.printf("All %ds on the diagonal\n", num);
                diagonalCount += 1;
            }
            if (checkDiagonal(matrix, num)[1]) {
                System.out.printf("All %ds on the diagonal\n", num);
                diagonalCount += 1;
            }
        }
        if (diagonalCount == 0) {
            System.out.println("No same numbers on the diagonal");
        }

        // Check subDiagonal
        for (int num = 0; num < 2; num++) {
            if (checkSubdiagonal(matrix, num)) {
                System.out.printf("All %ds on the subdiagonal\n", num);
                subCount += 1;
            }
        }
        if (subCount == 0) {
            System.out.println("No same numbers on the subdiagonal");
        }
    }

    public static boolean checkRow(int[][] matrix, int row, int num) {
        for (int column = 0; column < matrix.length; column++)
            if (matrix[row][column] != num) {
                return false;
            }
        return true;
    }

    public static boolean checkColumn(int[][] matrix, int column, int num) {
        for (int row = 0; row < matrix.length; row++)
            if (matrix[row][column] != num) {
                return false;
            }
        return true;
    }

    public static boolean[] checkDiagonal(int[][] matrix, int num) { // There are 2 diagonals: the main and the minor
        boolean leftDown = true; // left up go down to right(main)
        boolean leftUp = true; // left down to up to right(minor)

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != num) {
                leftDown = false;
            }
        }

        int startPoint = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (matrix[i][startPoint] != num) {
                leftUp = false;
            }
            startPoint += 1;
        }

        return new boolean[] { leftDown, leftUp };
    }

    public static boolean checkSuperdiagonal(int[][] matrix, int num) {// The super diagonal is the one above main
                                                                       // diagonal(left up go right down)
        boolean superDiagonal = true;

        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][i + 1] != num) {
                superDiagonal = false;
            }
        }

        return superDiagonal;
    }

    public static boolean checkSubdiagonal(int[][] matrix, int num) {// The sub diagonal is the one below main
                                                                     // diagonal(left up go right down)
        boolean subDiagonal = true;

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i - 1] != num) {
                subDiagonal = false;
            }
        }

        return subDiagonal;
    }
}
