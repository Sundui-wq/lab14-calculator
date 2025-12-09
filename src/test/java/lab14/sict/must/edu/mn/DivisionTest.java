package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Division классын тест.
 */
public class DivisionTest {

    // Хэвийн тоонууд (бүх if FALSE)
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
    void testDivideResultingInZero() {
        Division calc = new Division();
        assertEquals(0.0, calc.divide(0.0, 5.0), 0.001);
    }

    // Тэгээр хуваах (if TRUE - эхний нөхцөл)
    @Test
    void testDivideByZeroThrowsException() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5.0, 0.0);
        });
    }

    // NaN шалгалт (if TRUE - 2 дахь нөхцөл)
    @Test
    void testDivideWithNaN_FirstArg() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(Double.NaN, 5.0);
        });
    }

    @Test
    void testDivideWithNaN_SecondArg() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5.0, Double.NaN);
        });
    }

    // Infinity шалгалт (if TRUE - 3 дахь нөхцөл)
    @Test
    void testDivideWithInfinity_FirstArg() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(Double.POSITIVE_INFINITY, 5.0);
        });
    }

    @Test
    void testDivideWithInfinity_SecondArg() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5.0, Double.NEGATIVE_INFINITY);
        });
    }
}