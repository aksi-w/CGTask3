package ru.vsu.cs.cg.math;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix3f;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector3f;

import static org.junit.jupiter.api.Assertions.*;

public class MathTestMatrix3 {

    @Test
    void testAddition() {
        float[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrixData2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix3f matrix1 = new Matrix3f(matrixData1);
        Matrix3f matrix2 = new Matrix3f(matrixData2);
        Matrix3f result = Matrix3f.addition(matrix1, matrix2);
        Matrix3f expected = new Matrix3f(new float[][]{{10, 10, 10}, {10, 10, 10}, {10, 10, 10}});
        assertTrue(expected.equals(result));
    }


    @Test
    void testSubtraction() {
        float[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrixData2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix3f matrix1 = new Matrix3f(matrixData1);
        Matrix3f matrix2 = new Matrix3f(matrixData2);
        Matrix3f result = Matrix3f.subtraction(matrix1, matrix2);
        Matrix3f expected = new Matrix3f(new float[][]{{-8, -6, -4}, {-2, 0, 2}, {4, 6, 8}});
        assertTrue(expected.equals(result));
    }

    @Test
    void testMultiplication() {
        float[][] matrixData1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrixData2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix3f matrix1 = new Matrix3f(matrixData1);
        Matrix3f matrix2 = new Matrix3f(matrixData2);
        Matrix3f result = Matrix3f.multiplication(matrix1, matrix2);
        Matrix3f expected = new Matrix3f(new float[][]{{30, 24, 18}, {84, 69, 54}, {138, 114, 90}});
        assertTrue(expected.equals(result));
    }

    @Test
    void testTransposition() {
        float[][] matrixData = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix3f matrix = new Matrix3f(matrixData);
        Matrix3f result = Matrix3f.transposition(matrix);
        Matrix3f expected = new Matrix3f(new float[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
        assertTrue(expected.equals(result));
    }

    @Test
    void testZeroMatrix() {
        Matrix3f result = Matrix3f.zeroMatrix();
        Matrix3f expected = new Matrix3f(new float[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        assertTrue(expected.equals(result));
    }

    @Test
    void testUnitMatrix() {
        Matrix3f result = Matrix3f.unitMatrix();
        Matrix3f expected = new Matrix3f(new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        assertTrue(expected.equals(result));
    }

    @Test
    void testMultiplyOnVector() {
        float[][] matrixData = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix3f matrix = new Matrix3f(matrixData);
        Vector3f vector = new Vector3f(2, 3, 4);
        Vector3f result = Matrix3f.multiplyOnVector(matrix, vector);
        Vector3f expected = new Vector3f(20, 47, 74);

        float delta = 0.0000006f;
        assertEquals(expected.getX(), result.getX(), delta);
        assertEquals(expected.getY(), result.getY(), delta);
        assertEquals(expected.getZ(), result.getZ(), delta);
    }

}
