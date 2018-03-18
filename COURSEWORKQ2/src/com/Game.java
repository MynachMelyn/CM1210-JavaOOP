package com;

import com.Generator;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String input = "";
        int value;
        while (true) {
            System.out.println("Enter odd integer:");
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
        int[][] square = Generator.magicSquare(value);
        // Pass it a new copy, to avoid scrambling the old one.
        int[][] scrambledSquare = shuffleSquare(Generator.magicSquare(value));
        assert (square[0][0] != scrambledSquare[0][0]);

        Scanner scanner = new Scanner(System.in);
        int movesMade = 0;
        while (!compareSquares(square, scrambledSquare)) {
            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square.length; j++) {
                    System.out.print(scrambledSquare[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("Enter coordinates to swap (i j U/R/D/L):");
            String command = scanner.nextLine();
            if (command.matches("\\d \\d [URDL]")) {
                String[] commands = command.split("\\s");
                int i = Integer.parseInt(commands[0]);
                int j = Integer.parseInt(commands[1]);
                int n = square.length;
                if (i >= 0 && i < square.length && j >= 0 && i < square.length) {
                    int otherX=0, otherY=0;
                    switch (commands[2].toUpperCase()) {
                        case "U": // up
                            otherY = (j - 1 >= 0) ? j- 1 : n - 1;
                            otherX = i;
                            break;
                        case "R": // right
                            otherX = (i + 1 < n) ? i + 1 : 0;
                            otherY = j;
                            break;
                        case "D": // down
                            otherX = i;
                            otherY = (j + 1 < n) ? j + 1 : 0;
                            break;
                        case "L": // left
                            otherX = (i - 1 >= 0) ? i- 1 : n - 1;
                            otherY = j;
                            break;
                    }
                    int temp = scrambledSquare[i][j];
                    scrambledSquare[i][j] = scrambledSquare[otherX][otherY];
                    scrambledSquare[otherX][otherY] = temp;
                    movesMade++;
                } else {
                    System.out.println("Index/direction provided is out of range.");
                }
            } else {
                System.out.println("Command not recognised\nFormat is <i j U/R/D/L>.");
            }
        }
        System.out.println("Success in " + movesMade + " number of moves.");
    }

    private static boolean compareSquares(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    private static int[][] shuffleSquare(int[][] square) {
        int n = square.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int idx = rand.nextInt(n);
            int idy = rand.nextInt(n);
            int dir = rand.nextInt(4);
            int a = square[idx][idy], otherX = 0, otherY = 0;
            switch (dir) {
                case 0: // up
                    otherY = (idy - 1 >= 0) ? idy - 1 : n - 1;
                    otherX = idx;
                    break;
                case 1: // right
                    otherX = (idx + 1 < n) ? idx + 1 : 0;
                    otherY = idy;
                    break;
                case 2: // down
                    otherX = idx;
                    otherY = (idy + 1 < n) ? idy + 1 : 0;
                    break;
                case 3: // left
                    otherX = (idx - 1 >= 0) ? idx - 1 : n - 1;
                    otherY = idy;
                    break;
            }
            square[idx][idy] = square[otherX][otherY];
            square[otherX][otherY] = a;
        }

        return square;
    }
}
