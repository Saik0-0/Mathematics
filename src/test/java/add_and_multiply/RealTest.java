package add_and_multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealTest {

    @Test
    void testToString() {
        Element q = new Real(4.7);
        assertEquals("4.7",q.toString());
    }

    @Test
    void add() {
        Element a = new Real(3.2);
        Element b = new Real(5.31);
        assertEquals(new Real(3.2 + 5.31).toString(), a.add(b).toString());
    }

    @Test
    void multiply() {
        Element a = new Real(3.2);
        Element b1 = new Real(5.6);
        assertEquals(new Real(3.2).multiply(new Real(5.6)).toString(), a.multiply(b1).toString());
    }
}