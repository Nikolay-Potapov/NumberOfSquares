package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void amountOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 4;
        int actual = sqrService.calculateSqrt(200, 300);
        assertEquals(expected, actual);

    }

    @Test
    void borderValues() {
        SQRService sqrService = new SQRService();
        int expected = 91;
        int actual = sqrService.calculateSqrt(100, 9801);
        assertEquals(expected, actual);

    }

    @Test
    void valuesToTheBorder() {
        SQRService sqrService = new SQRService();
        int expected = 89;
        int actual = sqrService.calculateSqrt(99, 9800);
        assertEquals(expected, actual);
    }

    @Test
    void valuesOutOfBorder() {
        SQRService sqrService = new SQRService();
        int expected = 89;
        int actual = sqrService.calculateSqrt(101, 9802);
        assertEquals(expected, actual);
    }

}