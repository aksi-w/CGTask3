package ru.vsu.cs.cg.math;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix4f;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector4f;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Matrix4fTest {

    @Test
    void testAddition() {
        float[][] matrixData1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        float[][] matrixData2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4f matrix1 = new Matrix4f(matrixData1);
        Matrix4f matrix2 = new Matrix4f(matrixData2);
        Matrix4f result = matrix1.addition(matrix1, matrix2);
        float[][] expected = {{17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}};
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testSubtraction() {
        float[][] matrixData1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        float[][] matrixData2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4f matrix1 = new Matrix4f(matrixData1);
        Matrix4f matrix2 = new Matrix4f(matrixData2);
        Matrix4f result = matrix1.subtraction(matrix1, matrix2);
        float[][] expected = {{-15, -13, -11, -9}, {-7, -5, -3, -1}, {1, 3, 5, 7}, {9, 11, 13, 15}};
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testMultiplication() {
        float[][] matrixData1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        float[][] matrixData2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        Matrix4f matrix1 = new Matrix4f(matrixData1);
        Matrix4f matrix2 = new Matrix4f(matrixData2);
        Matrix4f result = matrix1.multiplication(matrix1, matrix2);
        float[][] expected = {
                {80, 70, 60, 50},
                {240, 214, 188, 162},
                {400, 358, 316, 274},
                {560, 502, 444, 386}
        };
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testTransposition() {
        float[][] matrixData = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Matrix4f matrix = new Matrix4f(matrixData);
        Matrix4f result = matrix.transposition(matrix);
        float[][] expected = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testZeroMatrix() {
        Matrix4f result = new Matrix4f(new float[4][4]).zeroMatrix();
        float[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testUnitMatrix() {
        Matrix4f result = new Matrix4f(new float[4][4]).unitMatrix();
        float[][] expected = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        Assertions.assertArrayEquals(expected, result.getMatrix());
    }

    @Test
    void testMultiplyOnVector() {
        float[][] matrixData = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Matrix4f matrix = new Matrix4f(matrixData);
        Vector4f vector = new Vector4f(2, 3, 4, 5);
        Vector4f result = Matrix4f.multiplyOnVector(matrix, vector);
        Vector4f expected = new Vector4f(40, 96, 152, 208);
        float delta = 0.0000006f;
        assertEquals(expected.getX(), result.getX(), delta);
        assertEquals(expected.getY(), result.getY(), delta);
        assertEquals(expected.getZ(), result.getZ(), delta);
        assertEquals(expected.getW(), result.getW(), delta);
    }
}
