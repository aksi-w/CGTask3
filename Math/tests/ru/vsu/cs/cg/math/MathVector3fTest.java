package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector3f;

import static org.junit.jupiter.api.Assertions.*;

class MathVector3fTest {

    @Test
    void addition() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f vector3 = new Vector3f(3.0f, 4.0f, 5.0f);

        Vector3f result = Vector3f.addition(vector1, vector2, vector3);

        assertEquals(6.0f, result.getX());
        assertEquals(9.0f, result.getY());
        assertEquals(12.0f, result.getZ());
    }

    @Test
    void subtraction() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f vector3 = new Vector3f(3.0f, 4.0f, 5.0f);

        Vector3f result = Vector3f.subtraction(vector1, vector2, vector3);

        assertEquals(-4.0f, result.getX());
        assertEquals(-5.0f, result.getY());
        assertEquals(-6.0f, result.getZ());
    }

    @Test
    void lengthVector3() {
        Vector3f vector = new Vector3f(1.0f, 2.0f, 3.0f);
        float length = Vector3f.lengthVector3(vector);

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

        assertEquals(2.0f, result.getX(), 1e-6);
        assertEquals(4.0f, result.getY(), 1e-6);
        assertEquals(6.0f, result.getZ(), 1e-6);
    }

    @Test
    void division() {
        Vector3f vector = new Vector3f(4.0f, 6.0f, 8.0f);
        float a = 2.0f;

        Vector3f result = Vector3f.division(vector, a);

        assertEquals(2.0f, result.getX(), 1e-6);
        assertEquals(3.0f, result.getY(), 1e-6);
        assertEquals(4.0f, result.getZ(), 1e-6);
    }

    @Test
    void scalar() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f vector3 = new Vector3f(3.0f, 4.0f, 5.0f);
        float angleDegrees = 45.0f;

        float result = Vector3f.scalar(vector1, vector2, vector3, angleDegrees);

        // You should calculate the expected result here based on the formula
        // and compare it using assertions.
    }

    @Test
    void testScalar() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);
        Vector3f vector3 = new Vector3f(3.0f, 4.0f, 5.0f);

        float result = Vector3f.scalar(vector1, vector2, vector3);

        // You should calculate the expected result here based on the formula
        // and compare it using assertions.
    }

    @Test
    void cross() {
        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
        Vector3f vector2 = new Vector3f(2.0f, 3.0f, 4.0f);

        Vector3f result = vector1.cross(vector2);

        // Calculate the expected result based on the cross product formula
        // and compare it using assertions.
    }
}