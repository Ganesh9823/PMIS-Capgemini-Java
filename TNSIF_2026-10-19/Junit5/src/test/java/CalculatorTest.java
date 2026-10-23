
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator123 calc = new Calculator123();
        assertTrue(5 == calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator123 calc = new Calculator123();
        assertFalse(2 != calc.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator123 calc = new Calculator123();
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        Calculator123 calc = new Calculator123();
        assertEquals(4, calc.divide(20, 5));
    }

    @Test
    public void testDivideByZero() {
        Calculator123 calc = new Calculator123();

        assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(10, 0)
        );
    }
}
