package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Division классын тест.
 */
public class DivisionTest {

    @Test
    void testDivideNormalNumbers() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(6.0, 3.0), 0.001);
    }

    @Test
    void testDivideNegativeNumbers() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(-6.0, -3.0), 0.001);
    }

    @Test
    void testDivideMixedNumbers() {
        Division calc = new Division();
        assertEquals(-2.0, calc.divide(-6.0, 3.0), 0.001);
    }

    @Test
    void testDivideByZeroThrowsException() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5.0, 0.0);
        });
    }

    @Test
    void testDivideResultingInZero() {
        Division calc = new Division();
        assertEquals(0.0, calc.divide(0.0, 5.0), 0.001);
    }
}