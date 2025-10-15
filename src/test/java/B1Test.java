import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class B1Test {

    @Test
    void c1Coverage() {
        b1 obj = new b1();

        assertEquals('I', obj.Grade(-10), "1");
        assertEquals('A', obj.Grade(9), "2");
        assertEquals('B', obj.Grade(8), "3");
        assertEquals('C', obj.Grade(7), "4");
        assertEquals('D', obj.Grade(6), "5");
        assertEquals('F', obj.Grade(3), "6");
    }

    @Test
    void c2Coverage() {
        b1 obj = new b1();

        assertEquals('I', obj.Grade(-10), "1");
        assertEquals('A', obj.Grade(9), "2");
        assertEquals('B', obj.Grade(8), "3");
        assertEquals('C', obj.Grade(7), "4");
        assertEquals('D', obj.Grade(6), "5");
        assertEquals('F', obj.Grade(3), "6");
    }
}
