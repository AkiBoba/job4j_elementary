package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new  String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new  String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Ivan Ivan";
        names[2] = "Alex Alex";
        names[3] = "Serg Serg";
        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
