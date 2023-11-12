package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector4f;

import static org.junit.jupiter.api.Assertions.*;

class MathVector4fTest {
    @Test
    void addition() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);
        Vector4f vector3 = new Vector4f(3.0f, 4.0f, 5.0f, 6.0f);
        Vector4f vector4 = new Vector4f(4.0f, 5.0f, 6.0f, 7.0f);

        Vector4f result = Vector4f.addition(vector1, vector2, vector3, vector4);

        assertEquals(10.0f, result.getX());
        assertEquals(14.0f, result.getY());
        assertEquals(18.0f, result.getZ());
        assertEquals(22.0f, result.getW());
    }

    @Test
    void subtraction() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);
        Vector4f vector3 = new Vector4f(3.0f, 4.0f, 5.0f, 6.0f);
        Vector4f vector4 = new Vector4f(4.0f, 5.0f, 6.0f, 7.0f);

        Vector4f result = Vector4f.subtraction(vector1, vector2, vector3, vector4);

        assertEquals(-8.0f, result.getX());
        assertEquals(-10.0f, result.getY());
        assertEquals(-12.0f, result.getZ());
        assertEquals(-14.0f, result.getW());
    }

    @Test
    void lengthVector3() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        float length = Vector4f.lengthVector3(vector);

        assertEquals(5.477226, length, 1e-6);
    }

    @Test
    void normalize() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f normalized = Vector4f.normalize(vector);

        assertEquals(0.182574, normalized.getX(), 1e-6);
        assertEquals(0.365148, normalized.getY(), 1e-6);
        assertEquals(0.547723, normalized.getZ(), 1e-6);
        assertEquals(0.730297, normalized.getW(), 1e-6);
    }

    @Test
    void multiplication() {
        Vector4f vector = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        float a = 2.0f;

        Vector4f result = Vector4f.multiplication(vector, a);

        assertEquals(2.0f, result.getX());
        assertEquals(4.0f, result.getY());
        assertEquals(6.0f, result.getZ());
        assertEquals(8.0f, result.getW());
    }

    @Test
    void division() {
        Vector4f vector = new Vector4f(4.0f, 6.0f, 8.0f, 10.0f);
        float a = 2.0f;

        Vector4f result = Vector4f.division(vector, a);

        assertEquals(2.0f, result.getX(), 1e-6);
        assertEquals(3.0f, result.getY(), 1e-6);
        assertEquals(4.0f, result.getZ(), 1e-6);
        assertEquals(5.0f, result.getW(), 1e-6);
    }

    @Test
    void scalar() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);
        Vector4f vector3 = new Vector4f(3.0f, 4.0f, 5.0f, 6.0f);
        Vector4f vector4 = new Vector4f(4.0f, 5.0f, 6.0f, 7.0f);
        float angleDegrees = 45.0f;

        float result = Vector4f.scalar(vector1, vector2, vector3, vector4, angleDegrees);

    }

    @Test
    void testScalar() {
        Vector4f vector1 = new Vector4f(1.0f, 2.0f, 3.0f, 4.0f);
        Vector4f vector2 = new Vector4f(2.0f, 3.0f, 4.0f, 5.0f);
        Vector4f vector3 = new Vector4f(3.0f, 4.0f, 5.0f, 6.0f);
        Vector4f vector4 = new Vector4f(4.0f, 5.0f, 6.0f, 7.0f);

        float result = Vector4f.scalar(vector1, vector2, vector3, vector4);

    }

}