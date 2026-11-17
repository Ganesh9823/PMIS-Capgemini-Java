import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {
    @Test
    public void testAdd() {
        calculator123 calc = new calculator123();
        assertEquals(5, calc.add(2, 3));
    }
}