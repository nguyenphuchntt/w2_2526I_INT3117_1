import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void boundaryTests() {
        assertEquals(5, calculator.calculateFee(Calculator.MOTORBIKE, 10, true), "Boundary: TC1");
        assertEquals(30, calculator.calculateFee(Calculator.SMALL_CAR, 10, true), "Boundary: TC2");
        assertEquals(50, calculator.calculateFee(Calculator.MEDIUM_CAR, 10, true), "Boundary: TC3");
        assertEquals(30, calculator.calculateFee(Calculator.SMALL_CAR, 0, true), "Boundary: TC4");
        assertEquals(30, calculator.calculateFee(Calculator.SMALL_CAR, 1, true), "Boundary: TC5");
        assertEquals(50, calculator.calculateFee(Calculator.SMALL_CAR, 23, true), "Boundary: TC6");
        assertEquals(50, calculator.calculateFee(Calculator.SMALL_CAR, 24, true), "Boundary: TC7");

        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, 10, false), "Boundary: TC8");

        assertEquals(5, calculator.calculateFee(Calculator.MOTORBIKE, 11, true), "Boundary: T15");
        assertEquals(50, calculator.calculateFee(Calculator.SMALL_CAR, 12, true), "Boundary: T16");
        assertEquals(100, calculator.calculateFee(Calculator.MEDIUM_CAR, 13, true), "Boundary: T17");

        assertEquals(-1, calculator.calculateFee(0, 10, true), "Boundary: TC9");
        assertEquals(-1, calculator.calculateFee(4, 10, true), "Boundary: TC10");
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, -1, true), "Boundary: TC11");
        assertEquals(-2, calculator.calculateFee(Calculator.SMALL_CAR, 25, true), "Boundary: TC12");
        assertEquals(-1, calculator.calculateFee(4, 10, false), "Boundary: TC13");
        assertEquals(-1, calculator.calculateFee(0, 10, false), "Boundary: TC14");
    }

    @Test
    void decisionTableTests() {
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, -1, true), "Decision Table: TC1");
        assertEquals(5, calculator.calculateFee(Calculator.MOTORBIKE, 5, true), "Decision Table: TC2");
        assertEquals(15, calculator.calculateFee(Calculator.MOTORBIKE, 15, true), "Decision Table: TC3");
        assertEquals(-2, calculator.calculateFee(Calculator.MOTORBIKE, 30, true), "Decision Table: TC4");
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, -3, false), "Decision Table: TC5");
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, 6, false), "Decision Table: TC6");
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, 16, false), "Decision Table: TC7");
        assertEquals(-1, calculator.calculateFee(Calculator.MOTORBIKE, 25, false), "Decision Table: TC8");

        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, -2, true), "Decision Table: TC9");
        assertEquals(30, calculator.calculateFee(Calculator.SMALL_CAR, 5, true), "Decision Table: TC10");
        assertEquals(50, calculator.calculateFee(Calculator.SMALL_CAR, 13, true), "Decision Table: TC11");
        assertEquals(-2, calculator.calculateFee(Calculator.SMALL_CAR, 25, true), "Decision Table: TC12");
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, -1, false), "Decision Table: TC13");
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, 3, false), "Decision Table: TC14");
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, 12, false), "Decision Table: TC15");
        assertEquals(-1, calculator.calculateFee(Calculator.SMALL_CAR, 76, false), "Decision Table: TC16");

        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, -5, true), "Decision Table: TC17");
        assertEquals(50, calculator.calculateFee(Calculator.MEDIUM_CAR, 3, true), "Decision Table: TC18");
        assertEquals(100, calculator.calculateFee(Calculator.MEDIUM_CAR, 15, true), "Decision Table: TC19");
        assertEquals(-2, calculator.calculateFee(Calculator.MEDIUM_CAR, 53, true), "Decision Table: TC20");
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, -1, false), "Decision Table: TC21");
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, 5, false), "Decision Table: TC22");
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, 15, false), "Decision Table: TC23");
        assertEquals(-1, calculator.calculateFee(Calculator.MEDIUM_CAR, 55, false), "Decision Table: TC24");

        assertEquals(-1, calculator.calculateFee(5, -1, true), "Decision Table: TC25");
        assertEquals(-1, calculator.calculateFee(5, 0, true), "Decision Table: TC26");
        assertEquals(-1, calculator.calculateFee(5, 10, true), "Decision Table: TC27");
        assertEquals(-1, calculator.calculateFee(0, 110, true), "Decision Table: TC28");
        assertEquals(-1, calculator.calculateFee(0, -4, false), "Decision Table: TC29:");
        assertEquals(-1, calculator.calculateFee(0, 4, false), "Decision Table: TC30");
        assertEquals(-1, calculator.calculateFee(10, 14, false), "Decision Table: TC31");
        assertEquals(-1, calculator.calculateFee(10, 44, false), "Decision Table: TC32");
    }
}
