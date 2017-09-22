package task05;

import java.util.Scanner;

/**
 * Created by anton on 22.09.17.
 */
public class Matrix {

    public static void main(String[] args) {
        System.out.print("Enter square matrix dimension: ");
        int n = new Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - i - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
