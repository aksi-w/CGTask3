package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Matrix.Matrix4f;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector4f;

import static org.junit.jupiter.api.Assertions.*;

class Matrix4fTest {

    @Test
    void addition() {
        float[][] m1 = {
                {1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        Matrix4f matrix1 = new Matrix4f(m1);

        float[][] m2 = {
                {2.0f, 3.0f, 4.0f, 5.0f},
                {6.0f, 7.0f, 8.0f, 9.0f},
                {10.0f, 11.0f, 12.0f, 13.0f},
                {14.0f, 15.0f, 16.0f, 17.0f}
        };
        Matrix4f matrix2 = new Matrix4f(m2);

        float[][] res = {
                {3.0f, 5.0f, 7.0f, 9.0f},
                {11.0f, 13.0f, 15.0f, 17.0f},
                {19.0f, 21.0f, 23.0f, 25.0f},
                {27.0f, 29.0f, 31.0f, 33.0f}
        };
        Matrix4f expectedMatrix = new Matrix4f(res);

        Matrix4f result = Matrix4f.addition(matrix1, matrix2);

        assertArrayEquals(expectedMatrix.getMatrix(), result.getMatrix());
    }

    @Test
    void subtraction() {
        float[][] m1 = {
                {1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        Matrix4f matrix1 = new Matrix4f(m1);

        float[][] m2 = {
                {2.0f, 3.0f, 4.0f, 5.0f},
                {6.0f, 7.0f, 8.0f, 9.0f},
                {10.0f, 11.0f, 12.0f, 13.0f},
                {14.0f, 15.0f, 16.0f, 17.0f}
        };
        Matrix4f matrix2 = new Matrix4f(m2);

        float[][] expectedData = {
                {-1.0f, -1.0f, -1.0f, -1.0f},
                {-1.0f, -1.0f, -1.0f, -1.0f},
                {-1.0f, -1.0f, -1.0f, -1.0f},
                {-1.0f, -1.0f, -1.0f, -1.0f}
        };
        Matrix4f expectedMatrix = new Matrix4f(expectedData);

        Matrix4f result = Matrix4f.subtraction(matrix1, matrix2);

        assertArrayEquals(expectedMatrix.getMatrix(), result.getMatrix());
    }

    @Test
    void multiplication() {
        float[][] m1 = {
                {1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        Matrix4f matrix1 = new Matrix4f(m1);

        float[][] m2 = {
                {2.0f, 3.0f, 4.0f, 5.0f},
                {6.0f, 7.0f, 8.0f, 9.0f},
                {10.0f, 11.0f, 12.0f, 13.0f},
                {14.0f, 15.0f, 16.0f, 17.0f}
        };
        Matrix4f matrix2 = new Matrix4f(m2);

        float[][] m = {
                {100.0f, 110.0f, 120.0f, 130.0f},
                {228.0f, 254.0f, 280.0f, 306.0f},
                {356.0f, 398.0f, 440.0f, 482.0f},
                {484.0f, 542.0f, 600.0f, 658.0f}
        };
        Matrix4f res = new Matrix4f(m);

        Matrix4f result = Matrix4f.multiplication(matrix1, matrix2);

        assertArrayEquals(res.getMatrix(), result.getMatrix());
    }

    @Test
    void transposition() {
        float[][] m = {
                {1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        Matrix4f matrix = new Matrix4f(m);

        float[][] expected = {
                {1.0f, 5.0f, 9.0f, 13.0f},
                {2.0f, 6.0f, 10.0f, 14.0f},
                {3.0f, 7.0f, 11.0f, 15.0f},
                {4.0f, 8.0f, 12.0f, 16.0f}
        };
        Matrix4f expectedMatrix = new Matrix4f(expected);

        Matrix4f result = Matrix4f.transposition(matrix);

        assertArrayEquals(expectedMatrix.getMatrix(), result.getMatrix());
    }

    @Test
    void zeroMatrix() {
        float[][] expected = {
                {0.0f, 0.0f, 0.0f, 0.0f},
                {0.0f, 0.0f, 0.0f, 0.0f},
                {0.0f, 0.0f, 0.0f, 0.0f},
                {0.0f, 0.0f, 0.0f, 0.0f}
        };
        Matrix4f m = new Matrix4f(expected);

        Matrix4f result = Matrix4f.zeroMatrix();

        assertArrayEquals(m.getMatrix(), result.getMatrix());
    }

    @Test
    void unitMatrix() {
        float[][] expected = {
                {1.0f, 0.0f, 0.0f, 0.0f},
                {0.0f, 1.0f, 0.0f, 0.0f},
                {0.0f, 0.0f, 1.0f, 0.0f},
                {0.0f, 0.0f, 0.0f, 1.0f}
        };
        Matrix4f m = new Matrix4f(expected);

        Matrix4f result = Matrix4f.unitMatrix();

        assertArrayEquals(m.getMatrix(), result.getMatrix());
    }

    @Test
    void multiplyOnVector() {
        float[][] m = {
                {1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        Matrix4f matrix = new Matrix4f(m);

        Vector4f vector = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);

        Vector4f result = Matrix4f.multiplyOnVector(matrix, vector);


        assertEquals(40f, result.getX(), 1e-6);
        assertEquals(96f, result.getY(), 1e-6);
        assertEquals(152f, result.getZ(), 1e-6);
        assertEquals(208f, result.getW(), 1e-6);
    }
}