package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix3f;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MathTestMatrix3 {
    @Test
    void testAddition() {
        float[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Matrix3f m1 = new Matrix3f(matrix1);
        Matrix3f m2 = new Matrix3f(matrix2);

        Matrix3f result = Matrix3f.addition(m1, m2);

        float[][] expectedResult = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testSubtraction() {
        float[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Matrix3f m1 = new Matrix3f(matrix1);
        Matrix3f m2 = new Matrix3f(matrix2);

        Matrix3f result = Matrix3f.subtraction(m1, m2);

        float[][] expectedResult = {{-8, -6, -4}, {-2, 0, 2}, {4, 6, 8}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testMultiplication() {
        float[][] matrix1 = {{3, 2, 1}, {2, 5, 3}, {3, 4, 2}};
        float[][] matrix2 = {{3, 2, 1}, {2, 5, 3}, {3, 4, 2}};

        Matrix3f m1 = new Matrix3f(matrix1);
        Matrix3f m2 = new Matrix3f(matrix2);

        Matrix3f result = Matrix3f.multiplication(m1, m2);

        float[][] expectedResult = {{16, 20, 11}, {25, 41, 23}, {23, 34, 19}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testTransposition() {
        float[][] matrix = {{16, 20, 11}, {25, 41, 23}, {23, 34, 19}};
        Matrix3f m = new Matrix3f(matrix);

        Matrix3f result = Matrix3f.transposition(m);

        float[][] expectedResult = {{16, 25, 23}, {20, 41, 34}, {11, 23, 19}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }
}
