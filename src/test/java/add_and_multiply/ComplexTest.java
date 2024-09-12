package add_and_multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testToString() {
        Element a = new Complex(4, 2);
        assertEquals("4.0 + 2.0i", a.toString());
    }

    @Test
    void add() {
        Element a = new Complex(4, 2);
        Element b = new Complex(4.2, 7.1);
        assertEquals(new Complex(4 + 4.2, 2 + 7.1).toString(),
                a.add(b).toString());
    }

    @Test
    void multiply() {
        Element a = new Complex(4, 2);
        Element b = new Complex(4.2, -7.1);
        assertEquals(new Complex(4 * 4.2 + -1 * 2 * -7.1, 4 * -7.1 + 2 * 4.2).toString(),
                a.multiply(b).toString());
    }
}