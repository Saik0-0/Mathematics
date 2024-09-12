package add_and_multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {

    @Test
    void testToString() {
        Element a = new Vector3D(1, 2, 3);
        assertEquals("(1.0, 2.0, 3.0)", a.toString());
    }

    @Test
    void add() {
        Element a = new Vector3D(1, 2, 3);
        Element b = new Vector3D(3, 2, 1);
        assertEquals(new Vector3D(1 + 3, 2 + 2, 3 + 1).toString(),
                a.add(b).toString());
    }

    @Test
    void multiply() {
        Element a = new Vector3D(1, 2, 3);
        Element b = new Vector3D(3, 2, 1);
        assertEquals(new Vector3D(2 * 1 - 3 * 2,
                        3 * 3 - 1 * 1,
                        1 * 2 - 2 * 3).toString(),
                a.multiply(b).toString());
    }
}