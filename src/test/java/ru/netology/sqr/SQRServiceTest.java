package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateAmountOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 4;
        int actual = sqrService.calculateSqrt(200, 300);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAmountOfSquaresBorder() {
        SQRService sqrService = new SQRService();
        int expected = 91;
        int actual = sqrService.calculateSqrt(100, 9801);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAmountOfSquaresToTheBorder() {
        SQRService sqrService = new SQRService();
        int expected = 90;
        int actual = sqrService.calculateSqrt(99, 9800);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmountOfSquaresOutOfBorder() {
        SQRService sqrService = new SQRService();
        int expected = 88;
        int actual = sqrService.calculateSqrt(101, 9802);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmountOfSquaresToTheLowerBorder() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.calculateSqrt(1, 99);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmountOfSquaresBeyondTheUpperBorder() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.calculateSqrt(9802, 10000);
        assertEquals(expected, actual);
    }

}