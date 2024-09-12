package add_and_multiply;

import java.util.Arrays;

public class Matrix implements Element {
    private final double[][] matrix;

    public Matrix(double[][] values) {
        this.matrix = new double[values.length][values[0].length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public double getMatrixElement(int row, int column) {
        return matrix[row][column];
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }

    @Override
    public Matrix add(Element other) {
        if (other instanceof Matrix mOther) {
            if (matrix[0].length == mOther.matrix[0].length && matrix.length == mOther.matrix.length) {
                Matrix newMatrix = new Matrix(matrix.length, mOther.matrix[0].length);

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        newMatrix.matrix[i][j] = matrix[i][j] + mOther.matrix[i][j];
                    }
                }

                return newMatrix;
            }
            else
                throw new IndexOutOfBoundsException("Matrices are not compatible in size");
        }
        else
            throw new IllegalArgumentException("Not a Matrix argument");
    }

    @Override
    public Matrix multiply(Element other) {
        if (other instanceof Matrix mOther) {
            if (matrix[0].length == mOther.matrix.length) {
                Matrix newMatrix = new Matrix(matrix.length, mOther.matrix[0].length);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < mOther.matrix[0].length; j++) {
                        newMatrix.matrix[i][j] = 0;
                    }
                }

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < mOther.matrix[0].length; j++) {

                        for (int k = 0; k < matrix[0].length; k++) {
                            newMatrix.matrix[i][j] += matrix[i][k] * mOther.matrix[k][j];
                        }

                    }
                }

                return newMatrix;
            }
            else throw new IndexOutOfBoundsException("Matrices are not compatible in size");
        }
        else
            throw new IllegalArgumentException("Not a Matrix argument");
    }
}
