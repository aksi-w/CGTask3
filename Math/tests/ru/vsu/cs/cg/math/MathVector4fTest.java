package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector4f;

import static org.junit.jupiter.api.Assertions.*;

class MathVector4fTest {
    @Test
    void addition() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);

        Vector4f result = Vector4f.addition(vector1, vector2);
        Vector4f expected = new Vector4f(3f,5f,7f,9f);

        assertTrue(expected.equals(result));
    }

    @Test
    void subtraction() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);

        Vector4f result = Vector4f.subtraction(vector1, vector2);
        Vector4f expected = new Vector4f(-1f,-1f,-1f,-1f);

        assertTrue(expected.equals(result));
    }

    @Test
    void lengthVector3() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        float length = Vector4f.lengthVector(vector);

        assertEquals(5.477226, length, 1e-6);
    }

    @Test
    void normalize() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f normalized = Vector4f.normalize(vector);
        Vector4f expected = new Vector4f(0.182574f, 0.365148f, 0.547723f, 0.730297f);
        assertTrue(expected.equals(normalized));
//        assertEquals(0.182574, normalized.getX(), 1e-6);
//        assertEquals(0.365148, normalized.getY(), 1e-6);
//        assertEquals(0.547723, normalized.getZ(), 1e-6);
//        assertEquals(0.730297, normalized.getW(), 1e-6);
    }

    @Test
    void multiplication() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        float a = 2.0f;

        Vector4f result = Vector4f.multiplication(vector, a);
        Vector4f expected = new Vector4f(2f,4f,6f,8f);

        assertTrue(expected.equals(result));
    }

    @Test
    void division() {
        Vector4f vector = new Vector4f(4.0f, 6.0f, 8.0f, 10.0f);
        float a = 2.0f;

        Vector4f result = Vector4f.division(vector, a);
        Vector4f expected = new Vector4f(2f,3f,4f,5f);

        assertTrue(expected.equals(result));
    }


    @Test
    void testScalar() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);

        float result = Vector4f.scalar(vector1, vector2);
        assertEquals(40, result);
    }

}