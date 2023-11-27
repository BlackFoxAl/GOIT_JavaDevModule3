package calculator.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new SumCalculator();
    }

    @Test
    void testThatSumOneWorksCorrect() {

        //When
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testThatSumThreeWorksCorrect() {

        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumExceptionWorksCorrect() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int actual = calc.sum(0);
        });
    }
}