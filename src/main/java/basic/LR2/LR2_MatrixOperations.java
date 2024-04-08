package LR2;

import java.util.Scanner;
import java.util.Random;

public class LR2_MatrixOperations {
    private int[][] matrix;
    static final int MIN_RANDOM_VALUE = 100;
    static final int MAX_RANDOM_VALUE = 1000;

    public static void main(String[] args) {
        LR2_MatrixOperations program = new LR2_MatrixOperations();
        program.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ширину матриці: ");
        int width = scanner.nextInt();
        System.out.println("Введіть висоту матриці: ");
        int height = scanner.nextInt();

        System.out.println("Виберіть спосіб створення матриці:");
        System.out.println("1. Введення з клавіатури");
        System.out.println("2. Генерація рандомно");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = inputMatrix(width, height, scanner);
        } else if (choice == 2) {
            matrix = randomMatrix(width, height);
        }

        printMatrix();
        findMinMaxAverage();

    }

    private void printMatrix() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private int[][] inputMatrix(int width, int height, Scanner scanner) {
        int[][] mat = new int[height][width];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                    System.out.printf("Елемент [%d,%d]: ", i, j);
                    mat[i][j] = scanner.nextInt();
            }
        }
        return mat;
    }

    private int[][] randomMatrix(int width, int height) {
        Random random = new Random();
        int[][] mat = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mat[i][j] = random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE;
            }
        }
        return mat;
    }

    private void findMinMaxAverage() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
                sum += value;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Мінімум = " + min);
        System.out.println("Максимум = " + max);
        System.out.println("Середнє арифметичне = " + average);
    }
}
