package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void sumNumbers() {
        assertEquals(11.00, cal.sumNumbers(5.00, 6.00), 0.001);
    }

    @Test
    void subNumber() {
        assertEquals(12.00, cal.subNumber(25.00, 13.00), 0.001);
    }

    @Test
    void multNumbers() {
        assertEquals(6.00, cal.multNumbers(2.00, 3.00), 0.001);
    }

    @Test
    void divNumbers() {
        assertEquals(6.00, cal.divNumbers(12.00, 2.00), 0.001);
    }
}