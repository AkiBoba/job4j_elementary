package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left <= right ? right : left;
    }

    public  static int max(int left, int right, int a) {
        return max(max(left, right), a);
    }

    public  static int max(int left, int right, int a, int b) {
        return max(max(max(left, right), a), b);
    }
}
