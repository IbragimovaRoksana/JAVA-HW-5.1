package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldAmountOfSQRFrom200to300() {
        SQRService service = new SQRService();
        int leftLimit = 200;
        int rightLimit = 300;
        int expected = 3;
        int actual = service.amountOfSQR(leftLimit, rightLimit);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'from300to400', 300, 400, 3",
                    "'from200to500', 200, 500, 8",
                    "'from500to1000', 500, 1000, 9",
                    "'from1200to3000', 1200, 3000, 20",
            },
            delimiter = ','
    )
    void shouldAmountOfQSR(String text, int leftLimit, int rightLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.amountOfSQR(leftLimit, rightLimit);
        assertEquals(expected, actual);
    }
}