package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        prime = number == 1 ? false : true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (i < number) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
