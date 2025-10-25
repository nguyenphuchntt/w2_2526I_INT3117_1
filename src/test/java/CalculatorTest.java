import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testCalculateFee() {
        // vehicleType = -1, parkingTime = 10, isParking = True => -1
        assertEquals(-1, calculator.calculateFee(-1, 10, true));

        // MOTORBIKE tests
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, -1, true));
        assertEquals(5, calculator.calculateFee(Calculator.MOTORBIKE, 10, true));
        assertEquals(15, calculator.calculateFee(Calculator.MOTORBIKE, 15, true));
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, 10, false));

        // SMALL_CAR tests
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, -1, true));
        assertEquals(30, calculator.calculateFee(Calculator.SMALL_CAR, 10, true));
        assertEquals(50, calculator.calculateFee(Calculator.SMALL_CAR, 15, true));
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, 10, false));

        // MEDIUM_CAR tests
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, -1, true));
        assertEquals(50, calculator.calculateFee(Calculator.MEDIUM_CAR, 10, true));
        assertEquals(100, calculator.calculateFee(Calculator.MEDIUM_CAR, 15, true));
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, 10, false));
    }
}
