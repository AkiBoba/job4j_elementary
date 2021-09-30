package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author Vladimir Likhachev
 */
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {3, 4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }
}