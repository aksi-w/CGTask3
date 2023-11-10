package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix3x3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MathTestMatrix3 {
    @Test
    void testAddition() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix3x3 m1 = new Matrix3x3(matrix1);
        Matrix3x3 m2 = new Matrix3x3(matrix2);
        Matrix3x3 result = Matrix3x3.addition(new Matrix3x3[]{m1, m2});

        int[][] expectedResult = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testSubtraction() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix3x3 m1 = new Matrix3x3(matrix1);
        Matrix3x3 m2 = new Matrix3x3(matrix2);

        Matrix3x3 result = Matrix3x3.subtraction(new Matrix3x3[]{m1, m2});

        int[][] expectedResult = {{-8, -6, -4}, {-2, 0, 2}, {4, 6, 8}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testMultiplication() {
        int[][] matrix1 = {{3, 2, 1}, {2, 5, 3}, {3, 4, 2}};
        int[][] matrix2 = {{3, 2, 1}, {2, 5, 3}, {3, 4, 2}};
        Matrix3x3 m1 = new Matrix3x3(matrix1);
        Matrix3x3 m2 = new Matrix3x3(matrix2);

        Matrix3x3 result = Matrix3x3.multiplication(new Matrix3x3[]{m1, m2});

        int[][] expectedResult = {{16, 20, 11}, {25, 41, 23}, {23, 34, 19}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testTransposition() {
        int[][] matrix = {{16, 20, 11}, {25, 41, 23}, {23, 34, 19}};
        Matrix3x3 m = new Matrix3x3(matrix);

        Matrix3x3 result = Matrix3x3.transposition(new Matrix3x3(m.getMatrix()));

        int[][] expectedResult = {{16,25,23},{20,41,34},{11,23,19}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }
}
