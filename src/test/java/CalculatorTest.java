import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAllCases() {
        Calculator c = new Calculator();

        assertEquals(-1, c.calculateFee(-1, 10, true), "1");
        assertEquals(-1, c.calculateFee(Calculator.MOTORBIKE, -10, true), "2");
        assertEquals(-1, c.calculateFee(Calculator.MOTORBIKE, 10, false), "3");
        assertEquals(5, c.calculateFee(Calculator.MOTORBIKE, 5, true), "4");
        assertEquals(15, c.calculateFee(Calculator.MOTORBIKE, 15, true), "5");
        assertEquals(-2, c.calculateFee(Calculator.MOTORBIKE, 25, true), "6");
        assertEquals(-1, c.calculateFee(Calculator.SMALL_CAR, 10, false), "7");
        assertEquals(-1, c.calculateFee(Calculator.SMALL_CAR, -10, true), "8");
        assertEquals(30, c.calculateFee(Calculator.SMALL_CAR, 5, true), "9");
        assertEquals(50, c.calculateFee(Calculator.SMALL_CAR, 15, true), "10");
        assertEquals(-2, c.calculateFee(Calculator.SMALL_CAR, 25, true), "11");
        assertEquals(-1, c.calculateFee(Calculator.MEDIUM_CAR, 10, false), "12");
        assertEquals(-1, c.calculateFee(Calculator.MEDIUM_CAR, -10, true), "13");
        assertEquals(50, c.calculateFee(Calculator.MEDIUM_CAR, 5, true), "14");
        assertEquals(100, c.calculateFee(Calculator.MEDIUM_CAR, 14, true), "15");
        assertEquals(-2, c.calculateFee(Calculator.MEDIUM_CAR, 26, true), "16");
    }
}
