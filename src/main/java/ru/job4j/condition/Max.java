package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left <= right ? right : left;
        return result;
    }

    public  static int max(int left, int right, int a) {
        int result = max(left, right) <= a ? a : max(left, right);
        return result;
    }

    public  static int max(int left, int right, int a, int b) {
        int result = max(left, right, a) <= b ? b : max(left, right, a);
        return result;
    }
}
