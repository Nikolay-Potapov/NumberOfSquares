package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shoutSqrt() {
        SQRService sqrService = new SQRService();
        int expected = 10;
        int actual = sqrService.sqrt(100, 300 );
        assertEquals(expected, actual);

    }
}