package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int index = 0; index < array.length; index++) {
            int temp = array[index ];
            int i = index - 1;
            for (; i >= 0; i--) {
                if (temp < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = temp;
            }
        for (int number : array) {
            System.out.println(number);
        }
    }
}