package de0915;

import java.util.Scanner;

public class Ld6_241RDB316 {

    public static void main(String[] args) {
        System.out.println("241RDB316 Vladislav Ebert");

        int rows = 10;  // The number of rows and columns for both arrays
        int cols = 10;


        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];


        int valueA = 27;
        for (int diag = 0; diag < rows + cols - 1; diag++) {
            for (int i = 0; i <= diag; i++) {
                int j = diag - i;
                if (i < rows && j < cols && i >= j) {
                    A[i][j] = valueA--;
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i >= j) {
                    B[i][j] = j;
                }
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose which array to display: (A/B)");
        char choice = scanner.next().toUpperCase().charAt(0);

        switch (choice) {
            case '1':
                printArray(A, rows, cols);
                break;
            case '2':
                printArray(B, rows, cols);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        scanner.close();
    }

    // Helper method to print the arrays
    public static void printArray(int[][] array, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
