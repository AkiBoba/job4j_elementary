package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Vladimir Likhachev
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int temp = money - price;
        if (money - price != 0) {
            for (int coin : coins) {
                while (temp - coin >= 0) {
                    result[size++] = coin;
                    temp -= coin;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}
