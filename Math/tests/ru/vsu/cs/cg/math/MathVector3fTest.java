package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector3f;

import static org.junit.jupiter.api.Assertions.*;

class MathVector3fTest {
    private static final float eps = 1e-7f;

    @Test
    void addition() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f result = Vector3f.addition(vector1, vector2);
        Vector3f expected = new Vector3f(3f, 5f, 7f);
        assertTrue(expected.equals(result));
    }

    @Test
    void subtraction() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f result = Vector3f.subtraction(vector1, vector2);
        Vector3f expected = new Vector3f(-1f, -1f, -1f);
        assertTrue(expected.equals(result));
    }

    @Test
    void lengthVector3() {
        Vector3f vector = new Vector3f(1.0f, 2.0f, 3.0f);
        float length = Vector3f.lengthVector(vector);

        assertEquals(3.741657, length, 1e-6);
    }

    @Test
    void normalize() {
        Vector3f vector = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f normalized = Vector3f.normalize(vector);

        assertEquals(0.267261, normalized.getX(), 1e-6);
        assertEquals(0.534522, normalized.getY(), 1e-6);
        assertEquals(0.801784, normalized.getZ(), 1e-6);
    }

    @Test
    void multiplication() {
        Vector3f vector = new Vector3f(1.0f, 2.0f, 3.0f);
        float a = 2.0f;
        Vector3f result = Vector3f.multiplication(vector, a);
        Vector3f expected = new Vector3f(2f,4f,6f);
        assertTrue(expected.equals(result));
    }

    @Test
    void division() {
        Vector3f vector = new Vector3f(4.0f, 6.0f, 8.0f);
        float a = 2.0f;

        Vector3f result = Vector3f.division(vector, a);
        Vector3f expected = new Vector3f(2f, 3f, 4f);
        assertTrue(expected.equals(result));
    }

    @Test
    void testScalar() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);


        float result = Vector3f.scalar(vector1, vector2);
        assertEquals(20, result);

    }

    @Test
    void cross() {
        Vector3f vector1 = new Vector3f(5.0f, 2.0f, 4.0f);
        Vector3f vector2 = new Vector3f(6.0f, 10.0f, 5.0f);

        Vector3f result = vector1.cross(vector2);
        Vector3f expected = new Vector3f(-30f, -1f, 38f);
        assertTrue(expected.equals(result));

    }
}