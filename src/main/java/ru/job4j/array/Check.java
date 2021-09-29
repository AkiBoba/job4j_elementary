package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean dat : data) {
            boolean temp = data[0];
            if (dat != temp) {
                result = false;
                break;
            }
        }
        return result;
    }
}