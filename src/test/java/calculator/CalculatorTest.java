package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumEmptyStr() {
        assertEquals(-1, calculator.sum(""));
    }

    @Test
    public void testSumNoNumbers() {
        assertEquals(-1, calculator.sum("ababababa"));
    }

    @Test
    public void testSumNumberOnly() {
        assertEquals(29, calculator.sum("29"));
    }

    @Test
    public void testSumWithOneNumber() {
        assertEquals(25, calculator.sum("sumthis25number"));
    }
    
    @Test
    public void testSumWithTwoNumbers() {
        assertEquals(649, calculator.sum("sumthis25number624"));
    }

    @Test
    public void testSumWithPower() {
        assertEquals(31, calculator.sum("22,3^2"));
    }

    @Test
    public void testSumWithPowerSixth() {
        assertEquals(140, calculator.sum("76%%2^6"));
    }
}