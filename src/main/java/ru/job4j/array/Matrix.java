package ru.job4j.array;

/**
 * @author Vladimir Likhachev
 */
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                result[row][col] = (row + 1) * (col + 1);
            }
        }
        return result;
    }
}
