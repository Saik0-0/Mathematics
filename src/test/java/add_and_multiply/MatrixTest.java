package add_and_multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void add() {
        double[][] values = {
                {-4, 3, -2},
                {-8, 6, -5},
                {-7, 5, -4}};

        double[][] values2 = {
                {1, -3, 0},
                {10, 2, 7},
                {10, 7, 8}};
        Element matrix = new Matrix(values);
        Element matrix2 = new Matrix(values2);

        double[][] values3 = {
                {-4 + 1, 3 - 3, -2 + 0},
                {- 8 + 10, 6 + 2, -5 + 7},
                {-7 + 10, 5 + 7, -4 + 8}};
        Element matrix3 = new Matrix(values3);

        assertEquals(matrix3.toString(), matrix.add(matrix2).toString());
    }

    @Test
    void multiply() {
        double[][] values = {
                {-4, 3, -2},
                {-8, 6, -5},
                {-7, 5, -4}};

        double[][] values2 = {
                {1, -3, 0},
                {10, 2, 7},
                {10, 7, 8}};
        Element matrix = new Matrix(values);
        Element matrix2 = new Matrix(values2);

        double[][] values3 = {
                {-4 * 1 + 3 * 10 + -2 * 10, -4 * -3 + 3 * 2 + -2 * 7, -4 * 0 + 3 * 7 + -2 * 8},
                {-8 * 1 + 6 * 10 + -5 * 10, -8 * -3 + 6 * 2 + -5 * 7, -8 * 0 + 6 * 7 + -5 * 8},
                {-7 * 1 + 5 * 10 + -4 * 10, -7 * -3 + 5 * 2 + -4 * 7, -7 * 0 + 5 * 7 + -4 * 8}};
        Element matrix3 = new Matrix(values3);

        assertEquals(matrix3.toString(), matrix.multiply(matrix2).toString());
    }
}