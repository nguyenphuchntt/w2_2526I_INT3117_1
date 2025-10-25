import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Bai5Test {
    private bai5 calculator;

    @BeforeEach
    void setUp() {
        calculator = new bai5();
    }

    @Test
    void c2Coverage() {
        assertEquals(2, calculator.UCLN(4, 2));
        assertEquals(2, calculator.UCLN(2, 4));
        assertEquals(1, calculator.UCLN(-1, 0));
        assertEquals(1, calculator.UCLN(0, -1));
    }

    @Test
    void test() {
        assertEquals(1, calculator.UCLN(0, 1));
        assertEquals(1, calculator.UCLN(1, 1));
        assertEquals(2, calculator.UCLN(4, 2));
        assertEquals(1, calculator.UCLN(-1, 0));
        assertEquals(1, calculator.UCLN(-1, 1));
        assertEquals(2, calculator.UCLN(-2, 4));
        assertEquals(2, calculator.UCLN(2, 4));
        assertEquals(4, calculator.UCLN(12, 8));
        assertEquals(4, calculator.UCLN(12, 4));
        assertEquals(1, calculator.UCLN(0, -1));
        assertEquals(2, calculator.UCLN(0, -2));
        assertEquals(1, calculator.UCLN(1, -2));
        assertEquals(1, calculator.UCLN(2, -1));
        assertEquals(4, calculator.UCLN(4, 12));
        assertEquals(4, calculator.UCLN(8, 12));
    }
}
