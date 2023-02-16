package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldCalcExact(int expected, int lowrange, int highrange) {
        SQRService service = new SQRService();
        int actual = service.calc(lowrange, highrange);
        Assertions.assertEquals(expected, actual);

    }

}