package ru.vsu.cs.cg.math;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.cg.task3.popova_p_n.Vector.Vector2f;

import static org.junit.jupiter.api.Assertions.*;

public class MathVector2fTest {

    @Test
    void addition() {
        Vector2f vector1 = new Vector2f(1.0f, 2.0f);
        Vector2f vector2 = new Vector2f(3.0f, 4.0f);
        Vector2f result = Vector2f.addition(vector1, vector2);
        Vector2f expected = new Vector2f(4f, 6f);

        assertTrue(expected.equals(result));
    }

    @Test
    void subtraction() {
        Vector2f vector1 = new Vector2f(3.0f, 4.0f);
        Vector2f vector2 = new Vector2f(1.0f, 2.0f);
        Vector2f result = Vector2f.subtraction(vector1, vector2);
        Vector2f expected = new Vector2f(2f, 2f);
        assertTrue(expected.equals(result));
    }

    @Test
    void lengthVector() {
        Vector2f vector = new Vector2f(8.0f, 6.0f);
        float length = Vector2f.lengthVector(vector);
        assertEquals(10.0f, length);
    }

    @Test
    void normalize() {
        Vector2f vector = new Vector2f(3.0f, 4.0f);
        Vector2f normalized = Vector2f.normalize(vector);
        Vector2f expected = new Vector2f(0.6f, 0.8f);
        assertTrue(expected.equals(normalized));
    }

    @Test
    void multiplication() {
        Vector2f vector = new Vector2f(2.0f, 3.0f);
        Vector2f result = Vector2f.multiplication(vector, 2.0f);
        Vector2f expected = new Vector2f(4f, 6f);
        assertTrue(expected.equals(result));
    }

    @Test
    void division() {
        Vector2f vector = new Vector2f(4.0f, 6.0f);
        Vector2f result = Vector2f.division(vector, 2.0f);
        Vector2f expected = new Vector2f(2f,3f);
        assertTrue(expected.equals(result));
    }

    @Test
    void testScalar() {
        Vector2f vector1 = new Vector2f(6.0f, 8.0f);
        Vector2f vector2 = new Vector2f(3.0f, 4.0f);

        float result = Vector2f.scalar(vector1, vector2);
        assertEquals(50, result);
    }
}

