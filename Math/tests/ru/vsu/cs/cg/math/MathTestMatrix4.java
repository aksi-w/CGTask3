package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix4x4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MathTestMatrix4 {
    @Test
    void testAddition() {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4x4 m1 = new Matrix4x4(matrix1);
        Matrix4x4 m2 = new Matrix4x4(matrix2);

        Matrix4x4 result = Matrix4x4.addition(new Matrix4x4[]{m1, m2});

        int[][] expectedResult = {{17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testSubtraction() {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4x4 m1 = new Matrix4x4(matrix1);
        Matrix4x4 m2 = new Matrix4x4(matrix2);

        Matrix4x4 result = Matrix4x4.subtraction(new Matrix4x4[]{m1, m2});

        int[][] expectedResult = {{-15, -13, -11, -9}, {-7, -5, -3, -1}, {1, 3, 5, 7}, {9, 11, 13, 15}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testMultiplication() {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4x4 m1 = new Matrix4x4(matrix1);
        Matrix4x4 m2 = new Matrix4x4(matrix2);

        Matrix4x4 result = Matrix4x4.multiplication(new Matrix4x4[]{m1, m2});

        int[][] expectedResult = {{150, 130, 110, 90}, {382, 334, 286, 238}, {614, 538, 462, 386}, {846, 742, 638, 534}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }

    @Test
    void testTransposition() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Matrix4x4 m = new Matrix4x4(matrix);

        Matrix4x4 result = Matrix4x4.transposition(new Matrix4x4(m.getMatrix()));

        int[][] expectedResult = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        assertArrayEquals(expectedResult, result.getMatrix());
    }
}