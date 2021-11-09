package ru.netology.sqr;

public class SQRService {

    public int calculateSqrt(int bot, int top) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bot && i * i <= top) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
