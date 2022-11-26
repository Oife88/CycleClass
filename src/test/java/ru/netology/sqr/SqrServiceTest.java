package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void shouldCalcSqrLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSqrZeroLimit() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calcSqr(0, 200);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCalcSqrNegativeLimit() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calcSqr(-500, 1_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcSqrLimitUpper() {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.calcSqr(500, 1_000);

        Assertions.assertEquals(expected, actual);
    }
}