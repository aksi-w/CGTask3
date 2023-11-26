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
        assertEquals(4.0f, result.getX());
        assertEquals(6.0f, result.getY());
    }

    @Test
    void subtraction() {
        Vector2f vector1 = new Vector2f(3.0f, 4.0f);
        Vector2f vector2 = new Vector2f(1.0f, 2.0f);
        Vector2f result = Vector2f.subtraction(vector1, vector2);
        assertEquals(2.0f, result.getX());
        assertEquals(2.0f, result.getY());
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
        assertEquals(0.6f, normalized.getX());
        assertEquals(0.8f, normalized.getY());
    }

    @Test
    void multiplication() {
        Vector2f vector = new Vector2f(2.0f, 3.0f);
        Vector2f result = Vector2f.multiplication(vector, 2.0f);
        assertEquals(4.0f, result.getX());
        assertEquals(6.0f, result.getY());
    }

    @Test
    void division() {
        Vector2f vector = new Vector2f(4.0f, 6.0f);
        Vector2f result = Vector2f.division(vector, 2.0f);
        assertEquals(2.0f, result.getX());
        assertEquals(3.0f, result.getY());
    }

    @Test
    void testScalar() {
        Vector2f vector1 = new Vector2f(6.0f, 8.0f);
        Vector2f vector2 = new Vector2f(3.0f, 4.0f);

        float result = Vector2f.scalar(vector1, vector2);
        assertEquals(50, result);
    }
}

