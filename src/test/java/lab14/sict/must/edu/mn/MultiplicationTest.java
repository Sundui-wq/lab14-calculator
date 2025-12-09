package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Multiplication классын тест.
 */
public class MultiplicationTest {

    @Test
    void testMultiplyPositiveNumbers() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), 0.001);
    }

    @Test
    void testMultiplyNegativeNumbers() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(-2.0, -3.0), 0.001);
    }

    @Test
    void testMultiplyMixedNumbers() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), 0.001);
    }

    @Test
    void testMultiplyByZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(5.0, 0.0), 0.001);
    }
}