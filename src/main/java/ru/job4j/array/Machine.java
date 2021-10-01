package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Vladimir Likhachev
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int temp = money - price;
        if (money - price != 0) {
            for (int index = 0; index < coins.length; index++) {
                while (temp - coins[index] >= 0) {
                    rsl[size++] = coins[index];
                    temp -= coins[index];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
