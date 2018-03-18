package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "";
        int value;
        while (true) {
            System.out.println("Enter odd integer");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value % 2 == 1) {
                    break;
                }
            } catch (Exception e) {

            }
        }
        magicSquare(value);
    }

    private static void magicSquare(int n) {
        // Provided algorithm leads to -1 being used as an index, so here's one that works.
        int[][] magicSquare = new int[n][n];
        int x = n/2;
        int y = n-1;

        for (int num = 1; num <= n * n; ) {
            if (x == -1 && y == n) {
                y = n - 2;
                x = 0;
            } else {
                if (y == n) y = 0;
                if (x < 0) x = n - 1;
            }

            if (magicSquare[x][y] != 0) {
                y -= 2;
                x++;
            } else {
                magicSquare[x][y] = num++;
                y++;
                x--;
            }
        }

        System.out.println("Magic Square of " + n);
        System.out.println("Necessary sum of each row/col: " + n*(n*n + 1)/2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
