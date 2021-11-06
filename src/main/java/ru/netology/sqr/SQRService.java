package ru.netology.sqr;

public class SQRService {

    public int calculateSqrt(int bot, int top) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bot && i * i <= top) {
                return i;
            }
        }
        return 0;
    }
}
