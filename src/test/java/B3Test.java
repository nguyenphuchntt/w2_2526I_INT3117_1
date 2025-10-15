import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class B3Test {

    @Test
    void testAllCases() {
        b3 obj = new b3();

        assertEquals("A", obj.foo(65), "1");
        assertEquals("B", obj.foo(66), "2");
        assertEquals("C", obj.foo(67), "3");
        assertEquals("haven't check", obj.foo(68), "4");
    }
}
