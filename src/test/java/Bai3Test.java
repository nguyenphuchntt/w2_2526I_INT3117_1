import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai3Test {
    private bai3 calculator;

    @BeforeEach
    void setUp() {
        calculator = new bai3();
    }

    @Test
    void testCalFactorial_UniqueCases() {
        assertEquals(1, calculator.calFactorial(0));
        assertEquals(1, calculator.calFactorial(1));
        assertEquals(2, calculator.calFactorial(2));
    }
}
