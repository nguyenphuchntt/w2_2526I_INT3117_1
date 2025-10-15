import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class B2Test {

    @Test
    void c1Coverage() {
        b2 obj = new b2();
        int[] a = {1, 2, 3};
        assertEquals(6, obj.Sum(a, 3), "1");
    }

    @Test
    void c2Coverage() {
        b2 obj = new b2();
        int[] a = {1, 2, 3};
        assertEquals(6, obj.Sum(a, 3), "1");
    }

    @Test
    void forLoopTest() {
        b2 obj = new b2();

        int[] a1 = {1, 2, 3};
        assertEquals(0, obj.Sum(a1, -1), "1");

        int[] a2 = {1, 2, 3};
        assertEquals(1, obj.Sum(a2, 1), "2");

        int[] a3 = {1, 2, 3};
        assertEquals(3, obj.Sum(a3, 2), "3");

        int[] a4 = {1, 2, 3, 4, 5};
        assertEquals(15, obj.Sum(a4, 5), "4");
    }
}
